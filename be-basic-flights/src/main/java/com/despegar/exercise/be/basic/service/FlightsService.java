package com.despegar.exercise.be.basic.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.despegar.exercise.be.basic.service.flight.SearchFlightResponse;
import com.despegar.exercise.be.basic.util.JacksonUtils;

public class FlightsService {

    private static Logger LOGGER = LoggerFactory.getLogger(FlightsService.class.getName());
    private static final String FLIGHT_BASE_URL = "http://lb.despegar.it/fsm/service/items?searchtype=roundtrip&country=AR&from=";
    private static final String FLIGHT_END_URL = "&withpricesuggestionmatrix=true&withfaresuggestionchart=false";
    private static final String FLIGHT_DESTINATION_URL = "&to=";
    private static final String FLIGHT_ADULTS_URL = "&adults=";
    private static final String FLIGHT_CHILDREN_URL = "&children=";
    private static final String FLIGHT_RETURN_DATE_URL = "&return=";
    private static final String FLIGHT_DEPARTURE_DATE_URL = "&departure=";
    private static final String FLIGHT_CHANNEL_URL = "&itemtype=CLUSTERTYPE&brand=0&product=0&channel=";

    String pattern = "yyyy-MM-dd";
    DateTimeFormatter formatter = DateTimeFormat.forPattern(this.pattern);

    public SearchFlightResponse search(String origin, String destination, Integer adults, Integer children, String channel) {
        try {

            DateTime departureDateTime = new DateTime();
            departureDateTime = departureDateTime.plusDays(40);
            String departureDate = this.formatter.print(departureDateTime);

            DateTime returnDateTime = departureDateTime.plusDays(15);
            String returnDate = this.formatter.print(returnDateTime);

            String requestUrl = FLIGHT_BASE_URL + origin + FLIGHT_DESTINATION_URL + destination + FLIGHT_DEPARTURE_DATE_URL
                + departureDate + FLIGHT_RETURN_DATE_URL + returnDate + FLIGHT_ADULTS_URL + adults + FLIGHT_CHILDREN_URL
                + children + FLIGHT_CHANNEL_URL + channel + FLIGHT_END_URL;

            LOGGER.info("Request to Url: " + requestUrl);

            HttpGet httpRequest = new HttpGet(requestUrl);
            httpRequest.setHeader(new BasicHeader("X-UOW", "ROBOT"));
            httpRequest.setHeader(new BasicHeader("X-Client", ""));
            httpRequest.setHeader(new BasicHeader("Content-type", "application/json"));

            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpResponse response = httpclient.execute(httpRequest);

            String json = EntityUtils.toString(response.getEntity());

            LOGGER.info("Status code: " + response.getStatusLine().getStatusCode() + " - " + "Json Response: " + json);

            return (SearchFlightResponse) JacksonUtils.convertStringToJson(json, SearchFlightResponse.class);
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
        return null;
    }
}
