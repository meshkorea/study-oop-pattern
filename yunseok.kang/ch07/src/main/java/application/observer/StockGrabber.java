import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        // List로 observers를 관리한다 (add / remove)
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(aaplPrice, googPrice);
        }
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        // Price change -> notify observers
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        // Price change -> notify observers
        notifyObserver();
    }
}