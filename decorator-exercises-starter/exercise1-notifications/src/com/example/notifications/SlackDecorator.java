package com.example.notifications;

public class SlackDecorator extends NotifierDecorator{
    String channel;
    public SlackDecorator(Notifier base, String channel) {
        super(base);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        System.out.println("[SLACK -> " + channel + "]: " + text);
    }
    
}
