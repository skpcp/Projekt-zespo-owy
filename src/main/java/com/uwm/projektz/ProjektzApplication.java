package com.uwm.projektz;

import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.permission.repository.IPermissionRepository;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.priority.repository.IPriorityRepository;
import com.uwm.projektz.project.repository.IProjectRepository;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.role.repository.IRoleRepository;
import com.uwm.projektz.user.ob.UserOB;
import com.uwm.projektz.user.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedResources;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjektzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektzApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(IPermissionRepository permissionRepository, IRoleRepository roleRepository, IUserRepository userRepository, IPriorityRepository priorityRepository){
		List<PermissionOB> permissionOBList = new ArrayList<>();
		List<RoleOB> roleOBList = new ArrayList<>();
		if(permissionRepository.count() == 0){
			//zapisz podstawowe uprawnienia
			permissionOBList.add(new PermissionOB("PERMISSION1"));
			permissionOBList.add(new PermissionOB("PERMISSION2"));
			permissionOBList.add(new PermissionOB("PERMISSION3"));
			permissionOBList.add(new PermissionOB("PERMISSION4"));
			//Można dodać ile się chce.
			permissionRepository.save(permissionOBList);
		}
		if(roleRepository.count() == 0){
			//zapisz odpowiednie role
			List<PermissionOB> permissionOBListforRole = new ArrayList<>();
			roleOBList.add(new RoleOB("ADMIN",permissionOBList));

			for(int i = 0 ; i < permissionOBList.size()-2;i++){
				permissionOBListforRole.add(permissionOBList.get(i));
			}
			roleOBList.add(new RoleOB("ADVANCED_USER",permissionOBListforRole));
			if(!permissionOBListforRole.isEmpty()) permissionOBListforRole.clear();

			for(int i = 0 ; i < permissionOBList.size()-3;i++){
				permissionOBListforRole.add(permissionOBList.get(i));
			}
			roleOBList.add(new RoleOB("USER",permissionOBListforRole));
			roleRepository.save(roleOBList);
		}
		if(userRepository.count() == 0){
			userRepository.save(new UserOB("Gandalf","Gray","gandalf@middleearth","GandalfTheGray","12345",true,roleOBList.get(0),null,null));
		}
		if(priorityRepository.count() == 0){
			priorityRepository.save(new PriorityOB("Natychmiast","20 lat"));
		}

		return null;
	}
}
