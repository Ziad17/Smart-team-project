package com.example.AppUserClass;

public class Student extends User
{
    private String dep_name;
    private int dep_id;
    private String level_name;
    private int level_id;

    public Student()
    {}

    public Student(int id,String name,String token,String password, String email, String acadmic_id,String phone, String dep_name,String level_name,int dep_id,int level_id)
    {
        set_id(id);
        set_name(name);
        set_token(token);
        set_password(password);
        set_email(email);
        set_acadmic_id(acadmic_id);
        set_phone(phone);
        set_dep_name(dep_name);
        set_level_name(level_name);
        set_level_id(level_id);
        set_dep_id(dep_id);
    }

    public String get_level_name()
    {return level_name;}
    public void set_level_name(String level_name)
    {this.level_name=level_name;}

    public String get_dep_name()
    {return dep_name;}
    public void set_dep_name(String dep_name)
    {this.dep_name=dep_name;}

    public int get_dep_id()
    {return dep_id;}
    public void set_dep_id(int dep_id)
    {this.dep_id=dep_id;}

    public int get_level_id()
    {return level_id;}
    public void set_level_id(int level_id)
    {this.level_id=level_id;}



    public void show_my_results(int student_id)
    {}

    public void show_question_bank_by_subject(int student_id,int subject_id)
    {}

    public void add_subject_request(int student_id,int subject_id)
    {}

    public void show_my_subjects(int student_id)
    {}

    public void show_exam_schedule(int student_id,int subject_id)
    {}

    public void take_exam(int exam_id,int student_id)
    {}

    public void submit_exam(int exam_id,int student_id)
    {}

    public void answer_question(int student_id,int prime_answer_id,int question_id,int exam_id,boolean correct)
    {}

 //   public void ()
   // {}

 



}
