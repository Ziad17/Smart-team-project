package com.example.AppUserClass;

public class Result {

    private int result;
    private Actual_exam actual_exam;
    private Student student;

    public Result(){}

    public Result(int result)
    {
        set_result(result);
    }

    public Result(int result,Student student,Actual_exam actual_exam)
    {
        set_result(result);
        set_actual_exam(actual_exam);
        set_student(student);
    }


    public int get_result()
    {return this.result;}
    public void set_result(int result)
    {this.result=result;}

    public Student get_student()
    {return this.student;}
    public void set_student(Student student)
    {this.student=student;}

    public Actual_exam get_actual_exam()
    {return this.actual_exam;}
    public void set_actual_exam(Actual_exam actual_exam)
    {this.actual_exam=actual_exam;}








}
