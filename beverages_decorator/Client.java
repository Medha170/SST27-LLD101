package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
		coffee = new ChocolateDecorator(coffee);
		System.out.println("Cappuccino with Chocolate");
		System.out.println(coffee.cost());
		coffee = new EspressoShotDecorator(coffee);
		System.out.println("Cappuccino with Chocolate and Espresso Shot");
		System.out.println(coffee.cost());
		coffee = new MatchaDecorator(coffee);
		System.out.println("Cappuccino with Chocolate, Espresso Shot and Matcha");
		System.out.println(coffee.cost());

	}

}