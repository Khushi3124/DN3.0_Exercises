public class MobileApp implements Observer{

    public MobileApp(StockMarket stockMarket){
        stockMarket.register(this);
    }

    @Override
    public void update(int price) {
        System.out.println("[UPDATE][Device: Mobile] Current Stock price is: "+price);
    }
}
