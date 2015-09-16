package com.despegar.exercise.be.basic.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.despegar.exercise.be.basic.service.FlightsService;
import com.despegar.exercise.be.basic.service.flight.Item;
import com.despegar.exercise.be.basic.service.flight.SearchFlightResponse;

public class BeTest {

    private static Logger LOGGER = LoggerFactory.getLogger(BeTest.class.getName());


    @Test
    public void testSearchFlight() {

        FlightsService flightService = new FlightsService();

        SearchFlightResponse response = flightService.search("BUE", "MIA", 2, 1, "site");

        Assert.assertFalse(response.getItems().isEmpty());
        List<Item> items = response.getItems();
        for (Item item : items) {
            LOGGER.info(item.toString());
        }
    }
}
