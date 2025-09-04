package com.example.payments;

public class FastPayAdapter implements PaymentGateway {
    private FastPayClient client;

    FastPayAdapter(FastPayClient client) {
        this.client = client;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        return client.payNow(customerId, amountCents);
    }
    
}
