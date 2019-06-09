package com.rucha.whatsapp;

public class Chat {

    private int Photo3;
    private String User_Name;
    private String Time;
    private int Photo1;
    private String Message;
    private int Photo2;

    public Chat() {
    }

    public Chat(int photo3, String user_name, String time, int photo1, String message, int photo2) {

        Photo3 = photo3;
        User_Name = user_name;
        Time = time;
        Photo1 = photo1;
        Message = message;
        Photo2 = photo2;
    }

    public int getPhoto3() {
        return Photo3;
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

    public void setPhoto3(int photo3) {
        Photo1 = photo3;
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
