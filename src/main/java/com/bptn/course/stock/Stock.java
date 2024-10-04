package com.bptn.course.stock;

public class Stock {
	// Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructors
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0;
        this.marketCap = totalShares * price;
    }
    
    // Create the class methods 
    public void adjustPrice(int change){ //will change the price by a percent and recalculate the percentChange and marketCap
        price = price + change;
        percentChange = (double) change / price * 100;
        marketCap = totalShares * price;
    }

    public String toString(){//returns a single String and prints the output
        return "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n" + "Current Price: $" +
        price +  " (" + percentChange + "%)" + "\n" + "Market Cap: $" + marketCap;
    }
    
	public static void main(String[] args) {
		 Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
	     System.out.println(stock);
	     stock.adjustPrice(20);
	     System.out.println(stock);

	}

}
