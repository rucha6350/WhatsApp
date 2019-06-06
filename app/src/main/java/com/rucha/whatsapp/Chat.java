package com.rucha.whatsapp;

public class Chat {

    private String User_Name;
    private String Time;
    private int Photo1;
    private String Message;
    private int Photo2;

    public Chat() {
    }

    public Chat(String user_name, String time, int photo1, String message, int photo2) {
        User_Name = user_name;
        Time = time;
        Photo1 = photo1;
        Message = message;
        Photo2 = photo2;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public String getTime() {
        return Time;
    }

    public int getPhoto1() {
        return Photo1;
    }

    public String getMessage() {
        return Message;
    }

    public int getPhoto2() {
        return Photo2;
    }

    public void setUser_name(String user_name) {
        User_Name = user_name;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setPhoto1(int photo1) {
        Photo1 = photo1;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setPhoto2(int photo2) {
        Photo2 = photo2;
    }
}
