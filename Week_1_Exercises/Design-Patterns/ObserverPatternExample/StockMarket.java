import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private List<Observer> observers;
    private int price;

    public StockMarket(){
        this.observers = new ArrayList<>();
    }

    private boolean hasObserver(Observer observer){
        int index = observers.indexOf(observer);
        return index >= 0;
    }

    @Override
    public void register(Observer observer) {
      if(!hasObserver(observer)){
        observers.add(observer);
      }
    }

    @Override
    public void deregister(Observer observer) {
        if(hasObserver(observer)){
            observers.remove(observers.indexOf(observer));
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(price));
    }
    
    public void stockPriceUpdated(int price){
        this.price = price;
        notifyObservers();
    }
}
