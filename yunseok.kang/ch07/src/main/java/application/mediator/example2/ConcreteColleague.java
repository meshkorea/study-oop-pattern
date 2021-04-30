package application.mediator.example2;

public class ConcreteColleague extends Colleague {

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}