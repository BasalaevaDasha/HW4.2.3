package com.example.hw423;

import java.io.Serializable;

public class User implements Serializable {
    private String sIDEdText;
    private String sPlace1EdText;
    private String sTime1EdText;
    private String sPlace2EdText;
    private String sTime2EdText;
    private String sMoneyEdText;

    public User(String sIDEdText, String sPlace1EdText, String sTime1EdText, String sPlace2EdText, String sTime2EdText, String sMoneyEdText) {
        this.sIDEdText = sIDEdText;
        this.sPlace1EdText = sPlace1EdText;
        this.sTime1EdText = sTime1EdText;
        this.sPlace2EdText = sPlace2EdText;
        this.sTime2EdText = sTime2EdText;
        this.sMoneyEdText = sMoneyEdText;
    }

    public String getsIDEdText() {
        return sIDEdText;
    }

    public void setsIDEdText(String sIDEdText) {
        this.sIDEdText = sIDEdText;
    }

    public String getsPlace1EdText() {
        return sPlace1EdText;
    }

    public void setsPlace1EdText(String sPlace1EdText) {
        this.sPlace1EdText = sPlace1EdText;
    }

    public String getsTime1EdText() {
        return sTime1EdText;
    }

    public void setsTime1EdText(String sTime1EdText) {
        this.sTime1EdText = sTime1EdText;
    }

    public String getsPlace2EdText() {
        return sPlace2EdText;
    }

    public void setsPlace2EdText(String sPlace2EdText) {
        this.sPlace2EdText = sPlace2EdText;
    }

    public String getsTime2EdText() {
        return sTime2EdText;
    }

    public void setsTime2EdText(String sTime2EdText) {
        this.sTime2EdText = sTime2EdText;
    }

    public String getsMoneyEdText() {
        return sMoneyEdText;
    }

    public void setsMoneyEdText(String sMoneyEdText) {
        this.sMoneyEdText = sMoneyEdText;
    }
}
