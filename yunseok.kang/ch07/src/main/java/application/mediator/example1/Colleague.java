package application.mediator.example1;

public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator mediator) {
        mediator.addColleague(this);
        this.mediator = mediator;
    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleagueCode);
    }

    public void buyOffer(String stock, int shares) {
        this.mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void setCollCode (int collCode) {
        colleagueCode = collCode;
    }
}
