package test.java;

import main.java.GetStockQuote;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Author: aderrick
 * Date: 12/11/13
 * Purpose: basic test for GetStockQuote.java
 * Created with IntelliJ IDEA
 */

public class GetStockQuoteJUnitTest {

    @Test
    public void basicTest() throws  Exception{
        String symbol = "\"GOOG\"";  // the symbol is returned quoted.
        String quote = GetStockQuote.getQuote(symbol);
        assertTrue("String returned from yahoo starts with symbo", quote.startsWith(symbol));
    }
}
