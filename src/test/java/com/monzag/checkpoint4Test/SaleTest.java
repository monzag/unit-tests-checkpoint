package com.monzag.checkpoint4Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {

    private Sale sale;

    @BeforeEach
    public void setUp() {
        this.sale = new Sale("CookBook", "25.55", 23);
    }

    @Test
    public void testEmptyConstructor() {
        assertNotNull(new Sale());
    }

    @Test
    public void testGetProductName() {
        String expected = "CookBook";
        String actual = sale.getProductName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxRate() {
        Integer expected = 23;
        Integer actual = sale.getTaxRate();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNetValue() {
        BigDecimal expected = new BigDecimal(25.55);
        BigDecimal actual = sale.getNetValue();
        assertEquals(expected, actual);
    }





}