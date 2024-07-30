public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileObserver = new MobileApp(stockMarket);
        Observer webObserver = new WebApp(stockMarket);

        stockMarket.stockPriceUpdated(1000);
        stockMarket.stockPriceUpdated(3000);
        stockMarket.deregister(webObserver);
        stockMarket.stockPriceUpdated(2000);
        stockMarket.deregister(mobileObserver);
        stockMarket.register(webObserver);
        stockMarket.stockPriceUpdated(8000);
        
        stockMarket.deregister(webObserver);
        stockMarket.register(mobileObserver);
    }
}
