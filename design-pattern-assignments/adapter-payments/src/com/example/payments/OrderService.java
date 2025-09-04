package com.example.payments;

import java.util.Map;
import java.util.Objects;

public class OrderService {
    private final PaymentGateway gateway;

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    // Smell: still switches; your refactor should remove this by ensuring map contains adapters.
    public String charge(String customerId, int amountCents) {
        // Objects.requireNonNull(provider, "provider");
        // PaymentGateway gw = gateways.get(provider);
        // if (gw == null) throw new IllegalArgumentException("unknown provider: " + provider);
        return gateway.charge(customerId, amountCents);
    }
}
