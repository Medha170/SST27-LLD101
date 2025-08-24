public class StandardTaxCalculationMethod implements ITaxService {
    double taxRate = 0.18;

    @Override
    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
