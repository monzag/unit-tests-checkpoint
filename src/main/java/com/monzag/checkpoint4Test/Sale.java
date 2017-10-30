package com.monzag.checkpoint4Test;

import java.math.BigDecimal;

public class Sale {

    private String productName;
    private BigDecimal netValue;
    private Integer taxRate;

    public Sale() {
    }

    public Sale(String productName, String netValueSt, Integer taxRate) {
        setProductName(productName);
        setNetValue(netValueSt);
        setTaxRate(taxRate);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) throws IllegalArgumentException {
        if (productName.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.productName = productName;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(String netValueSt) throws IllegalArgumentException {
        BigDecimal netValue = new BigDecimal(netValueSt);
        if (netValue.scale() > 2) {
            throw new IllegalArgumentException();
        }
        this.netValue = netValue;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) throws IllegalArgumentException {
        if (taxRate < 0 || taxRate > 100) {
            throw new IllegalArgumentException();
        }
        this.taxRate = taxRate;
    }

    public BigDecimal getGrossValue() {
        BigDecimal taxPrice = netValue.multiply(new BigDecimal(taxRate)).divide(new BigDecimal(100));
        BigDecimal grossValue = netValue.add(taxPrice);

        return grossValue;
    }
}
