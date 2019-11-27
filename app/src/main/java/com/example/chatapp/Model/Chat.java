package com.example.chatapp.Model;

public class Chat {
    private String sender;
    private String receiver;
    private String meassage;

    public Chat(String sender, String receiver, String meassage) {
        this.sender = sender;
        this.receiver = receiver;
        this.meassage = meassage;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMeassage() {
        return meassage;
    }

    public void setMeassage(String meassage) {
        this.meassage = meassage;
    }
}
