
public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    void executePayment(){
        paymentStrategy.pay();
    }

    void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
