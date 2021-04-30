package application.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    // Used as a counter
    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;

        // Assign an observer ID and increment the static counter
        this.observerID = observerIDTracker;
        observerIDTracker += 1;

        // Message notifies user of new observer
        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    public void update(double aaplPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}