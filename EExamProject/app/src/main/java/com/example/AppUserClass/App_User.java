package com.example.AppUserClass;

public class App_User {

    private static User_Interface user;
    private static String type;
    public  static void set_user(Student user)
    {
        App_User.user=user;
        App_User.type="Student";
    }
    public  static void set_user(Professor user)
    {
        App_User.user=user;
        App_User.type="Professor";
    }
    public  static void set_user(Admin user)
    {
        App_User.user=user;
        App_User.type="Admin";
    }
    public  static void delete_user()
    {
        App_User.user=null;
        App_User.type=null;
    }
    public  static User_Interface get_user()
    {
        return App_User.user;
    }
    public static String get_type()
    {
        return App_User.type;
    }


    public static void login(String email,String password)
    {}

    public static void logout()
    {}

    public static void pull_general_faculty_information()
    {}

    public static void signup_as_student(String name,String password,String phone,String email,String acadmic_id,int faculty_id,int department_id,int level_id)
    {}

    public static void signup_as_professor(String name,String password,String phone,String email,String acadmic_id,int faculty_id,int department_id,int level_id,String master)
    {}
}
