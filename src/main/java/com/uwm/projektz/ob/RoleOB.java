package com.uwm.projektz.ob;
/**
 * Created by wojni on 10.03.2016.
 */
public class RoleOB extends BaseOB{
    String name;
    UserOB user;

    public RoleOB(String Name, UserOB User)
    {
        this.name = Name;
        this.user = User;
    }
}
