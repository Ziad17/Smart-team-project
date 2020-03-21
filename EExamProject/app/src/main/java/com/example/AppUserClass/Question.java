package com.example.AppUserClass;

import java.util.ArrayList;

public class Question {
    private String name;
    private int id;
    private Subject subject;
    private String difficulty;
    private int chapter;
    private String type;
    private ArrayList<Answer> answers;

    public Question(){}

    public Question(String name,int id)
    {
        set_id(id);
        set_name(name);
    }

    public Question(String name,int id,Subject subject, String difficulty, int chapter, String type)
    {
        set_id(id);
        set_name(name);
        set_subject(subject);
        set_difficulty(difficulty);
        set_chapter(chapter);
      //  set_answers(answers);
        set_type(type);
    }

    public Question(String name,int id,Subject subject, String difficulty, int chapter, String type, ArrayList<Answer> answers)
    {
        set_id(id);
        set_name(name);
        set_subject(subject);
        set_difficulty(difficulty);
        set_chapter(chapter);
        set_answers(answers);
        set_type(type);
    }


    public ArrayList<Answer> get_answers()
    { return answers; }
    public void set_answers(ArrayList<Answer> answers)
    {this.answers=answers;}

    public String get_type()
    {return this.type;}
    public void set_type(String type)
    {this.type=type;}


    public Subject get_subject()
    {
        return this.subject;
    }
    public void set_subject(Subject subject)
    {this.subject=subject;}


    public String get_difficulty()
    {return this.difficulty;}
    public void set_difficulty(String difficulty)
    {this.difficulty=difficulty;}


    public int get_chapter()
    {
        return this.chapter;
    }
    public void set_chapter(int chapter)
    {this.chapter=chapter;}



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
