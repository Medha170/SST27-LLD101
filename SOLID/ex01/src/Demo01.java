

public class Demo01 {
    public static void main(String[] args) {
        Client client = new EmailClient("a@shop.com");
        ITaxService taxService = new StandardTaxCalculationMethod();
        DataRepository repo = new TestRepo();
        new OrderService(client, taxService, repo).checkout( 100.0);
    }
}
