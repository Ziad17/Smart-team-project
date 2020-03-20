package com.example.AppUserClass;

public class Level {
    private String name;
    private int id;
    private Faculty faculty;

    public Level()
    {
    }
    public Level(String name,int id)
    {
        set_id(id);
        set_name(name);
    }
    public Level(String name,int id,Faculty faculty)
    {
        set_id(id);
        set_name(name);
        set_faculty(faculty);
    }


    public Faculty get_faculty()
    {
        return this.faculty;
    }
    public void set_faculty(Faculty faculty)
    {this.faculty=faculty;}




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
