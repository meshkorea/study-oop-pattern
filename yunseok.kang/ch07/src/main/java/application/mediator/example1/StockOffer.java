public class StockOffer {

    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int numOfShares, String stock, int colleageCode){
        this.stockShares = numOfShares;
        this.stockSymbol = stock;
        this.colleagueCode = colleageCode;
    }

    public int getstockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getCollCode() {
        return colleagueCode;
    }
}
