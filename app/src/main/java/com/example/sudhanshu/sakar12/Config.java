package com.example.sudhanshu.sakar12;


public class Config {
    //URL to our login.php file
    public static final String LOGIN_URL = "http://192.168.43.117/demo/login.php";
    public static final String SIGNUP_URL = "http://192.168.43.117/demo/index.php";
    public static final String CSIGNUP_URL = "http://192.168.43.117/demo/profile.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "email";
    public static final String NAME_SHARED_PREF = "name";
    public static final String MOBILE_SHARED_PREF = "mobileNo";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";

}

