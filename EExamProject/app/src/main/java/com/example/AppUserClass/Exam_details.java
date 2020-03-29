package com.example.AppUserClass;

public class Exam_details {

    private int id;
    private String type;
    private String difficulty;
    private int question_count;
    private Actual_exam actual_exam;
    private int chapter_num;


    public Exam_details(){}


    public Exam_details(int id,String type,String difficulty,int question_count,int chapter_num)
    {
        set_chapter_num(chapter_num);
        set_id(id);
        set_type(type);
        set_difficulty(difficulty);
        set_question_count(question_count);
    }

    public Exam_details(int id, String type, String difficulty, int question_count, int chapter_num, Actual_exam actual_exam)
    {
        set_actual_exam(actual_exam);
        set_chapter_num(chapter_num);
        set_id(id);
        set_type(type);
        set_difficulty(difficulty);
        set_question_count(question_count);
    }

    public String get_type()
    {
        return this.type;
    }
    public void set_type(String type)
    {this.type=type;}

    public String get_difficulty()
    {
        return this.difficulty;
    }
    public void set_difficulty(String difficulty)
    {this.difficulty=difficulty;}

    public int get_chapter_num()
    {
        return this.chapter_num;
    }
    public void set_chapter_num(int chapter_num)
    {this.chapter_num=chapter_num;}

    public int get_question_count()
    {
        return this.question_count;
    }
    public void set_question_count(int question_count)
    {this.question_count=question_count;}


    public Actual_exam get_actual_exam()
    {
        return this.actual_exam;
    }
    public void set_actual_exam(Actual_exam actual_exam)
    {this.actual_exam=actual_exam;}


    public int get_id()
    {
        return this.id;
    }
    public void set_id(int id)
    {this.id=id;}

}
