package test.java;

import main.java.Stock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Author: aderrick
 * Date: 12/11/13
 * Purpose: J-Unit tests for Stock.java
 * Created with IntelliJ IDEA
 */



public class StockJUnitTest {

    private String expectedSymbol;
    private String expectedName;
    private String expectedPrice;
    Stock apple = new Stock("AAPL", "Apple Inc.", "629.71");

    @Before
    public void setUp() throws Exception {
        expectedSymbol = "AAPL";
        expectedName = "Apple Inc.";
        expectedPrice = "629.71";
    }

    @Test
    public void testStockConstructor() {
        Stock google = new Stock("GOOG", "Google Inc.", "744");
        assertEquals("GOOG", google.getSymbol());
        assertEquals("Google Inc.", google.getStockName());
        assertEquals("744", google.getPrice());
    }

    @Test
    public void testGetSymbol() throws Exception {
        assertEquals(expectedSymbol, apple.getSymbol());
    }

    @Test
    public void testSetSymbol() throws Exception {
        Stock google = new Stock("GOOG", "Google Inc.", "744");
        google.setSymbol("TEST");
        assertEquals("TEST", google.getSymbol());
    }

    @Test
    public void testGetStockName() throws Exception {
        assertEquals(expectedName, apple.getStockName());
    }

    @Test
    public void testSetStockName() throws Exception {
        Stock google = new Stock("GOOG", "Google Inc.", "744");
        google.setStockName("TEST");
        assertEquals("TEST", google.getStockName());
    }

    @Test
    public void testGetPrice() throws Exception {
        assertEquals(expectedPrice, apple.getPrice());
    }

    @Test
    public void testSetPrice() throws Exception {
        Stock google = new Stock("GOOG", "Google Inc.", "744");
        google.setPrice("250");
        assertEquals("250", google.getPrice());
    }
}
