package com.example.AppUserClass;

public class Answer {
    private String name;
    private int id;
    private boolean correct;
    private Question question;

    public Answer(){}
    public Answer(String name,int id)
    {
        set_id(id);
        set_name(name);
    }

    public Answer(String name,int id,Question question,boolean correct)
    {
        set_id(id);
        set_name(name);
        set_question(question);
        setCorrect(correct);
    }

    public boolean isCorrect()
    {
        return this.correct;
    }
    public void setCorrect(boolean correct)
    {this.correct=correct;}


    public Question get_question()
    {
        return this.question;
    }
    public void set_question(Question question)
    {this.question=question;}


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
