package com.example.AppUserClass;

import java.util.Date;

public class Actual_exam {

    //private String name;
    private int id;
    private Subject subject;
    private Date date;
    private Date time;
    private int duration_in_minutes;
    private int degree;

    public Actual_exam(){}

    public Actual_exam(int id, Date date, Date time, int duration_in_minutes, int degree)
    {
        set_id(id);
        set_date(date);
        set_degree(degree);
        set_duration_in_minutes(duration_in_minutes);
        set_time(time);
    }

    public Actual_exam(int id, Date date, Date time, int duration_in_minutes, int degree, Subject subject)
    {
        set_subject(subject);
        set_id(id);
        set_date(date);
        set_degree(degree);
        set_duration_in_minutes(duration_in_minutes);
        set_time(time);
    }












    public Subject get_subject()
    {
        return this.subject;
    }
    public void set_subject(Subject subject)
    {this.subject=subject;}

    public int get_duration_in_minutes()
    {
        return this.duration_in_minutes;
    }
    public void set_duration_in_minutes(int duration_in_minutes)
    {this.duration_in_minutes=duration_in_minutes;}


    public int get_degree()
    {
        return this.degree;
    }
    public void set_degree(int degree)
    {this.degree=degree;}


    public Date get_time()
    {
        return this.time;
    }
    public void set_time(Date time)
    {this.time=time;}


    public Date get_date()
    {
        return this.date;
    }


    public void set_date(Date date)
    {this.date=date;}

    public int get_id()
    {
        return this.id;
    }
    public void set_id(int id)
    {this.id=id;}

}
