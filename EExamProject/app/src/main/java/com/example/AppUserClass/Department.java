package com.example.AppUserClass;

public class Department {
    private Faculty faculty;
    private int id;
    private String name;

    public Department(String name,int id,Faculty faculty)
    {
        set_faculty(faculty);
        set_name(name);
        set_id(id);
    }
    public Department(String name,int id)
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


    public Faculty get_faculty()
    {
        return this.faculty;
    }
    public void set_faculty(Faculty faculty)
    {this.faculty=faculty;}


}
