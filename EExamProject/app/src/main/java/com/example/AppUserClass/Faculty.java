package com.example.AppUserClass;

public class Faculty {
    private String name;
    private int id;

    public Faculty()
    {}

    public Faculty(String name,int id)
    {
        set_name(name);
        set_id(id);

    }
    public String get_name()
    {
        return this.name;
    }
    public void set_name(String name)
    {this.name=name;}


    public int get_id()
    {
        return this.id;
    }
    public void set_id(int id)
    {this.id=id;}
}
