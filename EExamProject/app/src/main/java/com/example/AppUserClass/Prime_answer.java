package com.example.AppUserClass;

public class Prime_answer {
    private int id;
    private Question question;
    private String content;
    private boolean correct;


    public Prime_answer(){}

    public Prime_answer(int id,String content,boolean correct)

    {
        set_content(content);
        set_id(id);
        set_correct(correct);

    }

    public Prime_answer(int id,String content,boolean correct,Question question)

    {
        set_question(question);
        set_content(content);
        set_id(id);
        set_correct(correct);

    }





    public boolean get_correct()
    {return this.correct;}
    public void set_correct(boolean correct)
    {this.correct=correct;}



    public Question get_question()
    {return this.question;}
    public void set_question(Question question)
    {this.question=question;}


    public String get_content()
    {return this.content;}
    public void set_content(String content)
    {this.content=content;}


    public int get_id()
    {
        return this.id;
    }
    public void set_id(int id)
    {this.id=id;}
}
}
