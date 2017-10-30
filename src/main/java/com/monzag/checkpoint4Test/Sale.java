package com.monzag.checkpoint4Test;

import java.math.BigDecimal;

public class Sale {

    private String productName;
    private BigDecimal netValue;
    private Integer taxRate;

    public Sale() {
    }

    public Sale(String productName, BigDecimal netValue, Integer taxRate) {
        this.productName = productName;
        this.netValue = netValue;
        this.taxRate = taxRate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }
}
