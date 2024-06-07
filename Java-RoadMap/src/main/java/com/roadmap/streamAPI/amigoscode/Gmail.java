package com.roadmap.streamAPI.amigoscode;

public class Gmail implements EmailSender{

    @Override
    public void send(String gmail) {
        System.out.println("sending email using gmail " + gmail);
    }
}
