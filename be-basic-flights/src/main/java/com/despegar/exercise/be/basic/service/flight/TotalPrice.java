package com.despegar.exercise.be.basic.service.flight;

public class TotalPrice {

    private Integer baseFare;
    private Integer totalFare;
    private Integer taxes;
    private Integer charges;

    public TotalPrice() {

    }

    public Integer getBaseFare() {
        return this.baseFare;
    }

    public void setBaseFare(Integer baseFare) {
        this.baseFare = baseFare;
    }

    public Integer getTotalFare() {
        return this.totalFare;
    }

    public void setTotalFare(Integer totalFare) {
        this.totalFare = totalFare;
    }

    public Integer getTaxes() {
        return this.taxes;
    }

    public void setTaxes(Integer taxes) {
        this.taxes = taxes;
    }

    public Integer getCharges() {
        return this.charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

}
