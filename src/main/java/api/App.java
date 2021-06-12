package api;


import java.io.*;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

/*
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
*/



    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here

        boolean exists;
        exists = arr.contains(k);
        if ( exists ) {
            return "YES";
        }
        else {
            return "NO";
        }

    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> final_array = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            int remainder = i % 2;
            if ( remainder == 0 ) {
                continue;
            }
            else {
                final_array.add(i);
            }
        }
        return final_array;
    }




    public static void main( String[] args ) throws IOException {
        System.out.println( "\n\n\nHacker RanK Project: \n\n" );

        List<Integer> test1 = new ArrayList<>();
        test1.add(1); test1.add(2); test1.add(1); test1.add(3); test1.add(5);

        //String result = findNumber(test1, 5);
        //System.out.println( MessageFormat.format("\nResult: {0}\n", result) );

        List<Integer> result = oddNumbers(2, 5);
        System.out.println( MessageFormat.format("\nResult: {0}\n", result) );
        System.out.println( "\n\n\nHacker RanK \n\n" );
    }




}
