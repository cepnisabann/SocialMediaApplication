package com.example.firebaseapp.notifications;

public class Token {
    // a fcm token knon as registration token allows its users to receiver messg

    String token;

    public Token(String token) {
        this.token = token;
    }

    public Token() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
