package beverages_decorator;

public class EspressoShotDecorator extends Beverage {
    Beverage beverage;

    public EspressoShotDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 70 + beverage.cost();
    }
    
}
