package com.example.payments;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, PaymentGateway> gateways = new HashMap<>();
        // TODO: register adapters instead of raw SDKs
        gateways.put("fastpay", new FastPayAdapter(new FastPayClient()));
        gateways.put("safecash", new SafeCashAdapter(new SafeCashClient()));
        OrderService svc1 = new OrderService(gateways.get("fastpay"));
        OrderService svc2 = new OrderService(gateways.get("safecash"));

        String id1 = svc1.charge("cust-1", 1299);
        String id2 = svc2.charge("cust-2", 1299);
        System.out.println(id1);
        System.out.println(id2);
    }
}
