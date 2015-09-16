package com.despegar.exercise.be.basic.service.flight;

public class Raw {

    private String currencyCode;
    private TotalPrice total;

    public Raw() {

    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public TotalPrice getTotal() {
        return this.total;
    }

    public void setTotal(TotalPrice total) {
        this.total = total;
    }

}
