package application.mediator.example2;

public class MobileColleague extends Colleague {

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}