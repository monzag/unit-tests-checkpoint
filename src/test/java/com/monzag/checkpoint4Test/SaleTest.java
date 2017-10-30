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
        expected = expected.setScale(2, BigDecimal.ROUND_DOWN);
        BigDecimal actual = sale.getNetValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmptyProductName() {
        String actual = "";
        assertThrows(IllegalArgumentException.class, () -> sale.setProductName(actual));
    }

    @Test
    public void testSetTaxRateNotLikePercent() {
        Integer actual = 101;
        assertThrows(IllegalArgumentException.class, () -> sale.setTaxRate(actual));
    }

    @Test
    public void testSetNetValueWithScaleMoreThan2() {
        String actual = "20.333";
        assertThrows(IllegalArgumentException.class, () -> sale.setNetValue(actual));
    }

    @Test
    public void testGetGrossValue() {
        BigDecimal expected = new BigDecimal(31.43);
        expected = expected.setScale(2, BigDecimal.ROUND_CEILING);
        BigDecimal actual = sale.getGrossValue();
        assertEquals(expected, actual);
    }





}