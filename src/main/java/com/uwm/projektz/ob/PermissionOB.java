package com.uwm.projektz.ob;
/**
 * Created by wojni on 11.03.2016.
 */
public class PermissionOB extends BaseOB{
    String name;
    RoleOB role;


    public PermissionOB(String name, RoleOB role)
    {
        this.name = name;
        this.role = role;
    }

    //getters
    public String getPermissionName () { return name;}
    public RoleOB getPermissionRole () {return role;}

    //setters
    public void setPermissionName (String name) {this.name = name;}
    public void setPermissionRole (RoleOB role) {this.role = role;}
}
