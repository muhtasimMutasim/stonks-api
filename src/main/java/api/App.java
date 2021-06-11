package api;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import yahoofinance.*;

public class App {


    public static void simpleTest() throws IOException {

        String tick = "TSLA";
        Stock stock = YahooFinance.get(tick);
        BigDecimal price = stock.getQuote().getPrice();

        System.out.println("\n\n\n" + tick + ": " + price);
    }

    public static void main( String[] args ) throws IOException {
        System.out.println( "\n\n\nStonks Project: " );
        simpleTest();



        System.out.println( "Stonks Project \n\n\n" );

    }

}
