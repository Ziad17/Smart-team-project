package com.example.AppUserClass;

public class Professor extends User
{
    private String master;
    //private java.util.Date req_date;
    private boolean stat_bool;
    private String stat_string;
    private String dep_name;
    private int dep_id;
    private boolean ADMIN_AUTH;

    public Professor()
    {}

    public Professor(int id,String name,String token,String password, String email, String acadmic_id,String phone, String dep_name,
                     int dep_id,String master,String stat_string,boolean stat_bool, boolean ADMIN_AUTH)
    {
        set_stat_bool(stat_bool);
        set_ADMIN_AUTH(ADMIN_AUTH);
        set_stat_string(stat_string);
        set_id(id);
        set_name(name);
        set_token(token);
        set_password(password);
        set_email(email);
        set_acadmic_id(acadmic_id);
        set_phone(phone);
        set_dep_name(dep_name);
        set_dep_id(dep_id);
        set_master(master);

    }

    //public Date get_req_date()
    // {return req_date;}
    // public void set_req_date(Date req_date)
    //  {this.req_date=req_date;}

    public String get_master()
    {return master;}
    public void set_master(String master)
    {this.master=master;}

    public String get_stat_string()
    {return stat_string;}
    public void set_stat_string(String stat_string)
    {this.stat_string=stat_string;}

    public boolean get_stat_bool()
    {return stat_bool;}
    public void set_stat_bool(boolean stat_bool)
    {this.stat_bool=stat_bool;}


    public boolean get_ADMIN_AUTH()
    {return ADMIN_AUTH;}
    public void set_ADMIN_AUTH(Boolean ADMIN_AUTH)
    {this.ADMIN_AUTH=ADMIN_AUTH;}

    public String get_dep_name()
    {return dep_name;}
    public void set_dep_name(String dep_name)
    {this.dep_name=dep_name;}


    public int get_dep_id()
    {return dep_id;}
    public void set_dep_id(int dep_id)
    {this.dep_id=dep_id;}

}

