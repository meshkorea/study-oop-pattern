package application.mediator.example1;

public class App {

    public static void main(String[] args) {

        StockMediator stockExchange = new StockMediator();

        PersonA brokerA = new PersonA(stockExchange);
        PersonB brokerB = new PersonB(stockExchange);

        brokerA.saleOffer("MSFT", 100);
        brokerA.saleOffer("GOOG", 50);

        brokerB.buyOffer("MSFT", 100);
        brokerB.saleOffer("NRG", 10);

        brokerA.buyOffer("NRG", 10);
    }
}