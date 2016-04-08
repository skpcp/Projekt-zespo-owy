package com.uwm.projektz.ob;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wojni on 10.03.2016.
 */
public class UserOB extends BaseOB {
    String name;
    String surname;
    String email;
    String login;
    String md5pass;
    Boolean active;
    Boolean type; // 1 - pracownik wewnetrzny, 0 - pracownik zewnetrzny;
    List<RoleOB> roles = new ArrayList<>();
    List<ProjectOB> projects = new ArrayList<>();

    public UserOB(String name, String surname, String email, String login, String md5pass, Boolean active, Boolean type)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.md5pass = md5pass;
        this.active = active;
        this.type = type;
    }

    public void addRoleToUser(UserOB userOB, RoleOB rola)
    {
        userOB.roles.add(rola);
    }
    public void removeRoleFromUser(UserOB userOB, RoleOB rola)
    {
        userOB.roles.remove(rola);
    }
    public void addProjectToUser(UserOB userOB, ProjectOB projectOB)
    {
        userOB.projects.add(projectOB);
    }
    public void removeProjectFromUser(UserOB userOB, ProjectOB projectOB)
    {
        userOB.projects.remove(projectOB);
    }

    //getters
    public String getUserName () { return name;}
    public String getUserSurname () { return surname;}
    public String getUserLogin () { return login;}
    public Boolean getUserIsActive () { return active;}
    public Boolean getUserType () { return type;}

    //setters
    public void setUserName (String name) { this.name = name;}
    public void setUserSurname (String surname) { this.surname = surname;}
    public void setUserLogin (String login) { this.login = login;}
    public void setUserMd5pass (String md5pass) { this.md5pass = md5pass;}
    public void setUserIsActive (Boolean active) { this.active = active;}
    public void setUserType (Boolean type) { this.type = type;}
}


