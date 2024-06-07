package com.roadmap.streamapi.amigoscode.gettingstarted;

public class Gmail implements EmailSender{

    @Override
    public void send(String gmail) {
        System.out.println("sending email using gmail " + gmail);
    }
}
