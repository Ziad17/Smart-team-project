package com.example.AppUserClass;

public class Subject {
    private String name;
    private int id;
    private String code;
    private int chapter_num;
    private Department department;
    private Level level;
    private Professor professor;

    public Subject()
    {}

    public Subject(String name,int id, String code,int chapter_num)
    {
        set_chapter_num(chapter_num);
        set_code(code);
        set_id(id);
        set_name(name);
    }

    public Subject(String name,int id, String code,int chapter_num,Department department,Professor professor ,Level level)
    {
        set_chapter_num(chapter_num);
        set_code(code);
        set_id(id);
        set_name(name);
        set_level(level);
        set_department(department);
        set_professor(professor);
    }


    public Professor get_professor()
    {return this.professor;}
    public void set_professor(Professor professor)
    {this.professor=professor;}


    public Level get_level()
    {return this.level;}
    public void set_level(Level level)
    {this.level=level;}


    public Department get_department()
    {return this.department;}
    public void set_department(Department department)
    {this.department=department;}

    public int get_chapter_num()
    {return this.chapter_num;}
    public void set_chapter_num(int chapter_num)
    {this.chapter_num=chapter_num;}


    public String get_code()
    {return this.code;}
    public void set_code(String code)
    {this.code=code;}


    public String get_name()
    {return this.name;}
    public void set_name(String name)
    {this.name=name;}


    public int get_id()
    {
        return this.id;
    }
    public void set_id(int id)
    {this.id=id;}
}
