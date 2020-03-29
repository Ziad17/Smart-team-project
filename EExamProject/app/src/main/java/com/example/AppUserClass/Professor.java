package com.example.AppUserClass;

public class Professor extends User
{
    private String master;
    //private java.util.Date req_date;
    private boolean stat_bool;
    private String stat_string;
    private String dep_name;
    private int dep_id;


    public Professor()
    {}

    public Professor(int id,String name,String token,String password, String email, String acadmic_id,String phone, String dep_name,
                     int dep_id,String master,String stat_string,boolean stat_bool)
    {
        set_stat_bool(stat_bool);
      //  set_ADMIN_AUTH(ADMIN_AUTH);
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


    public void show_students_by_subjects(int prof_id,int subject_id){}
    public void edit_subject_chapter(int prof_id,int chapter_num){}
    public void add_question(int prof_id,int sub_id,String type,int chapter_num,String difficulty,String content){}
    public void add_answer(int question_id,Sring content,boolean correct){}
    public void edit_question(int prof_id,int question_id,int sub_id,String type,int chapter_num,String difficulty,String content){}
    public void edit_answer(int answer_id,Sring content,boolean correct){}
    public void delete_question(int question_id){}
    public void delete_answer(int question_id){}
    public void delete_answer(int answer_id,int question_id){}
    public void view_student_subject_request(int prof_id,int subject_id){}
    public void edit_student_subject_request(int prof_id,int subject_id,int student_request_id){}
    public void delete_student_subject_request(int prof_id,int subject_id,int student_request_id){}
    //this method is the initaial step to create the exam and it contain the add_exam_strcture
    public void add_exam(int prof_id,int subject_id,Date date_in_day,Date time,int duration_in_minutes,int total_degree){}
    public void add_exam_structure(int exam_id,String type,int chapter_num,String difficulty,int question_number){}
    public void edit_exam(int exam_id,int prof_id,int subject_id,Date date_in_day,Date time,int duration_in_minutes,int total_degree){}
    public void edit_exam_structure(int det_exam_id,int exam_id,String type,int chapter_num,String difficulty,int question_number){}
    public void delete_exam(int prof_id,int exam_id){}
    public void delete_exam_structure(int prof_id,int structure_id){}
    public void show_exams_by_subjects(int prof_id,int subject_id){}
    public void show_results_of_exam(int exam_id){}

}

