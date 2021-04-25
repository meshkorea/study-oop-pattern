package application.observer;

/**
 * `update` method is called when Subject changes
 */
public interface Observer {

    public void update(double aaplPrice, double googPrice);

}