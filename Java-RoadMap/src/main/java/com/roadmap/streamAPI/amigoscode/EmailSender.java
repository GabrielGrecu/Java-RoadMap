package com.roadmap.streamAPI.amigoscode;

@FunctionalInterface
public interface EmailSender {
    void send(String email);
}
