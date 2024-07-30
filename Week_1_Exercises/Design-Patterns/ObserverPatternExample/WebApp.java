public class WebApp implements Observer{

    public WebApp(StockMarket stockMarket){
        stockMarket.register(this);
    }

    @Override
    public void update(int price) {
        System.out.println("[UPDATE][Device: Web] Current Stock Price: "+price);
    }
    
}
