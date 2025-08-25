
public class PaymentService {
    IPaymentService provider;

    PaymentService(IPaymentService provider){
        this.provider = provider;
    }

    String pay(Payment p){
        return provider.pay(p);
    }
}