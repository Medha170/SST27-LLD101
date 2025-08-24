public class OrderService {
    Client client;
    ITaxService taxService;
    DataRepository repo;

    OrderService(Client client, ITaxService taxService, DataRepository repo){
        this.client = client;
        this.taxService = taxService;
        this.repo = repo;
    }

    void checkout(double subtotal){
        double total = taxService.totalWithTax(subtotal);
        client.send("Thanks! Your total is " + total);
        repo.save();
    }
}