
public class Demo04 {
    public static void main(String[] args) {
        IPaymentService provider = new UPIPayment();
        System.out.println(new PaymentService(provider).pay(new Payment(499)));
    }
}
