package beverages_decorator;

public class MatchaDecorator extends Beverage {

    Beverage beverage;
    public MatchaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return 100 + beverage.cost();
    }
}
