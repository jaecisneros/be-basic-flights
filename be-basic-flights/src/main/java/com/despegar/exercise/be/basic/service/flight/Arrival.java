package com.despegar.exercise.be.basic.service.flight;

import java.util.Date;

public class Arrival {

    public Arrival() {

    }

    private String location;
    private Date dateTime;

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
