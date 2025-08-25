public class Demo03 {
    public static void main(String[] args) {
        IShippingCostCalculator shipper = new ExpressShipping();
        System.out.println(new ShippingCostCalculator(shipper).cost(new Shipment( 2.0)));
    }
}
