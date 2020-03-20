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

}
