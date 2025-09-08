package com.example.notifications;

public class SmsDecorator extends NotifierDecorator{
    String phoneNumber;
    public SmsDecorator(Notifier base, String phoneNumber) {
        super(base);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
    }
    
}
