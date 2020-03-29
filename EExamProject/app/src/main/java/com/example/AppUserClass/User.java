package com.example.AppUserClass;

class User implements User_Interface{

    protected int id;
    protected String token;
    protected String name;
    protected String password;
    protected String email;
    protected String acadmic_id;
    protected String phone;


    public int get_id()
    {return id;}
    public void set_id(int id)
    {this.id=id;}

    public String get_token()
    {return token;}
    public void set_token(String token)
    {this.token=token;}


    public String get_name()
    {return name;}
    public void set_name(String name)
    {this.name=name;}

    public String get_email()
    {return email;}
    public void set_email(String email)
    {this.email=email;}


    public String get_password()
    {return password;}
    public void set_password(String password)
    {this.password=password;}

    public String get_phone()
    {return phone;}
    public void set_phone(String phone)
    {this.phone=phone;}

    public String get_acadmic_id()
    {return acadmic_id;}
    public void set_acadmic_id(String acadmic_id)
    {this.acadmic_id=acadmic_id;}

    public void change_name(String new_name)
    {}

    public void change_password(String password)
    {}

    public void change_phone(String phone)
    {}

    //public void ()
   // {}
}