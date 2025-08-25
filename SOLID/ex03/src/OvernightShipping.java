public class OvernightShipping implements IShippingCostCalculator{

    @Override
    public double cost(Shipment s) {
        return 120 + 10*s.weightKg;
    }
    
}
