package main.java;

import org.apache.commons.io.IOUtils; // commons-io-2.4.jar file in lib/ supplies this
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

/**
 * Author: aderrick
 * Date: 12/11/13
 * Created with IntelliJ IDEA
 */

/**
 * Gets a String of information from Yahoo! Finance
 * Displays the string (the results) to user
 */
public class GetStockQuote {
    public static String getQuote(String sym) throws IOException {

        String params = "snl1d1t1jk";
        String theUrl = "http://download.finance.yahoo.com/d/quotes.csv?s=" + sym + "&f=" + params;
        InputStream inputStream;
        StringWriter stringWriter;
        URL url = new URL(theUrl);
        inputStream = url.openStream();
        stringWriter = new StringWriter();
        IOUtils.copy(inputStream, stringWriter);
        return stringWriter.toString();
    }
    public static void main(String[] args) throws IOException{
        System.out.println("Making system call");
        System.out.println(getQuote("GOOG"));
        System.out.println("Program completed");
    }
}
