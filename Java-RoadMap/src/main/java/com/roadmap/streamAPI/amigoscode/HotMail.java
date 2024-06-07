package com.roadmap.streamAPI.amigoscode;

public class HotMail implements EmailSender{

    @Override
    public void send(String email) {
        System.out.println("sending email using hotmail " + email);
    }
}
