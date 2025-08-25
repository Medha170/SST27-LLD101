public class ExpressShipping implements IShippingCostCalculator {

    @Override
    public double cost(Shipment s) {
        return 80 + 8*s.weightKg;
    }
    
}
