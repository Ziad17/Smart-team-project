package com.example.AppUserClass;

import sun.net.www.content.text.plain;

public class Admin extends Professor {
    private Professor professor;

    public Admin(){}

    public Admin(Professor professor){
        set_professor(professor);
    }

    public void set_professor(Professor professor)
    {
        this.professor=professor;
    }
    public Professor get_professor()
    {
        return this.professor;
    }


    public void add_faculty(String name){}
    public void update_faculty(int faculty_id, String name){}
    public void delete_faculty(int faculty_id){}
    public void add_level(String name,int level_rank,int faculty_id){}
    public void update_level(int level_id,String name,int level_rank){}
    public void delete_level(int level_id){}
    public void add_department(String name,int level_id){}
    public void update_department(int dep_id,String name){}
    public void delete_department(int dep_id){}
    public void add_subject(String name,String code,int chapter_num, int dep_id, int level_id){}
    public void update_subject(int subject_id,String name,String code,int chapter_num, int dep_id, int level_id,int prof_id){}
    public void delete_subject(int subject_id){}
    public void view_professor_requests(){}
    public void add_professor(int request_id){}
    public void delete_professor(int professor_id){}
    public void update_professor(int professor_id,boolean state,int dep_num){}
    public void add_or_edit_subject_to_professor(int professor_id,int[] subject_id_array){}
    public void view_subjects_of_professor(int professor_id){}
    public void delete_professor_request(int request_id){}

 

}
