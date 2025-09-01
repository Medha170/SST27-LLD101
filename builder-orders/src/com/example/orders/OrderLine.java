package com.example.orders;

public final class OrderLine {
    private final String sku;
    private final int quantity;
    private final int unitPriceCents;

    public OrderLine(OrderLineBuilder builder) {
        this.sku = builder.sku;
        this.quantity = builder.quantity;
        this.unitPriceCents = builder.unitPriceCents;
    }

    public String getSku() { return sku; }
    public int getQuantity() { return quantity; }
    public int getUnitPriceCents() { return unitPriceCents; }

    public static class OrderLineBuilder {
        private String sku;
        private int quantity;
        private int unitPriceCents;
        public OrderLineBuilder setSku(String sku) { this.sku = sku; return this; }
        public OrderLineBuilder setQuantity(int quantity) { this.quantity = quantity; return this; }
        public OrderLineBuilder setUnitPriceCents(int unitPriceCents) { this.unitPriceCents = unitPriceCents; return this; }
        public OrderLine build() { return new OrderLine(this); }
    }
}
