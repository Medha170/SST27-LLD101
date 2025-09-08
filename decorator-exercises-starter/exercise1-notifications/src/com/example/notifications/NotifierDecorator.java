package com.example.notifications;

public abstract class NotifierDecorator implements Notifier {
    Notifier base;
    public NotifierDecorator(Notifier base) {
        this.base = base;
    }

    @Override
    public abstract void notify(String text) ;
    
    
}
