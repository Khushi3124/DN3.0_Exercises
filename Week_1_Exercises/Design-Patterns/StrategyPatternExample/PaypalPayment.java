
public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("[PayPal]: Payment paid successfully");
    }
}
