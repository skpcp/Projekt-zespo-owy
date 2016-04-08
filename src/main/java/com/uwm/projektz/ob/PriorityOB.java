package com.uwm.projektz.ob;
/**
 * Created by wojni on 10.03.2016.
 */
public class PriorityOB extends BaseOB{
    String name;
    String responseTime;


    public PriorityOB(String name, String responseTime)
    {
        this.name = name;
        this.responseTime = responseTime;
    }

    //getters
    public String getPriorityName () {return name;}
    public String getPriorityResponseTime () {return responseTime;}

    //setters
    public void setPriorityName (String name) {this.name = name;}
    public void setPriorityResponseTime (String response) {this.responseTime = response;}
}
