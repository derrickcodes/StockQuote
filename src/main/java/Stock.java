package main.java;

/**
 * Author: aderrick
 * Date: 12/11/13
 * Created with IntelliJ IDEA
 */

public class Stock {
    private String symbol;
    private String stockName;
    private String price;

    /**
     * Constructor for Stock object
     *
     * @param symbol This is the symbol on the stock exchange
     * @param name   This is the actual name of the company
     * @param price  This is the price of a share of the stock
     */
    public Stock(String symbol, String name, String price) {
        this.symbol = symbol;
        this.stockName = name;
        this.price = price;
    }

    /**
     *
     * @return symbol the stock exchange symbol, such as GOOG
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     *
     * @param symbol The symbol is a stock exchange symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     *
     * @return stockName the actual name of the company
     */
    public String getStockName(){
        return stockName;
    }

    /**
     *
     * @param name sets the actual name of the company
     */
    public void setStockName(String name) {
        this.stockName = name;
    }

    /**
     *
     * @return price the price of the stock
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price sets the price is the price of the stock
     */
    public void setPrice(String price) {
        this.price = price;
    }
}
