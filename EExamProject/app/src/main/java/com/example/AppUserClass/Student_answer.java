package com.example.AppUserClass;

public class Student_answer {
    private boolean state;
    private Question question;
    private Prime_answer prime_answer;
    private Student student;
    private Actual_exam actual_exam;


    public Student_answer(){}

    public Student_answer(boolean state)
    {
        set_state(state);
    }

    public Student_answer(boolean state,Student student,Question question,Prime_answer prime_answer,Actual_exam actual_exam)
    {
        set_state(state);
        set_actual_exam(actual_exam);
        set_prime_answer(prime_answer);
        set_student(student);
        set_question(question);
    }






    public boolean get_state()
    {return this.state;}
    public void set_state(boolean state)
    {this.state=state;}


    public Question question()
    {return this.question;}
    public void set_question(Question question)
    {this.question=question;}

    public Student get_student()
    {return this.student;}
    public void set_student(Student student)
    {this.student=student;}

    public Actual_exam get_actual_exam()
    {return this.actual_exam;}
    public void set_actual_exam(Actual_exam actual_exam)
    {this.actual_exam=actual_exam;}

    public Prime_answer get_prime_answer()
    {return this.prime_answer;}
    public void set_prime_answer(Prime_answer prime_answer)
    {this.prime_answer=prime_answer;}


}
