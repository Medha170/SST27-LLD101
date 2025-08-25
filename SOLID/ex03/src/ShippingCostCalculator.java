public class ShippingCostCalculator {
    IShippingCostCalculator shipper;

    ShippingCostCalculator(IShippingCostCalculator shipper){
        this.shipper = shipper;
    }

    double cost(Shipment s){
        return shipper.cost(s);
    }
}
