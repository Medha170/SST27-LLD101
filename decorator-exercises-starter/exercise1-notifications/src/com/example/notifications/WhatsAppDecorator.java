package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator{
    String userName;

    public WhatsAppDecorator(Notifier base, String userName) {
        super(base);
        this.userName = userName;
    }

    @Override
    public void notify(String text) {
        System.out.println("[WHATSAPP -> " + userName + "]: " + text);
    }
    
}
