package com.despegar.exercise.be.basic.service.flight;

import java.util.List;

public class SearchFlightResponse {

    private List<Item> items;

    public SearchFlightResponse() {

    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
