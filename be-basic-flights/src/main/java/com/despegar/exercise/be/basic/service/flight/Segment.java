package com.despegar.exercise.be.basic.service.flight;


public class Segment {

    private Arrival arrival;
    private Departure departure;
    private Integer flightNumber;
    private String carrier;

    public Segment() {

    }

    public Arrival getArrival() {
        return this.arrival;
    }

    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    public Departure getDeparture() {
        return this.departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

}
