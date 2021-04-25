import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        this.colleagues = new ArrayList<Colleague>();
        this.stockBuyOffers = new ArrayList<StockOffer>();
        this.stockSaleOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes += 1;
        newColleague.setCollCode(colleagueCodes);
    }

    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;

        for (StockOffer offer: stockBuyOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }

        if (!stockSold) {
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSaleOffers.add(newOffering);
        }
    }

    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;

        for (StockOffer offer: stockSaleOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                stockSaleOffers.remove(offer);
                stockBought = true;
            }

            if (stockBought) {
                break;
            }
        }

        if (!stockBought) {
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }
    }
}