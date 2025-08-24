public class Test01 {
    public static void main(String[] args) {
        Client client = new SMSClient("1234567890");
        ITaxService taxService = new StandardTaxCalculationMethod();
        DataRepository repo = new TestRepo();
        new OrderService(client, taxService, repo).checkout( 200.0);
    }
}
