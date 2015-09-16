package com.despegar.exercise.be.basic.service.flight;

import java.util.List;

public class ItinerariesBox {

    private List<OutboundRoutes> outboundRoutes;
    private List<InboundRoutes> inboundRoutes;
    private ItineraryPrice itineraryPrice;

    public ItinerariesBox() {

    }

    public List<OutboundRoutes> getOutboundRoutes() {
        return this.outboundRoutes;
    }

    public void setOutboundRoutes(List<OutboundRoutes> outboundRoutes) {
        this.outboundRoutes = outboundRoutes;
    }

    public List<InboundRoutes> getInboundRoutes() {
        return this.inboundRoutes;
    }

    public void setInboundRoutes(List<InboundRoutes> inboundRoutes) {
        this.inboundRoutes = inboundRoutes;
    }

    @Override
    public String toString() {
        return "Itinerary";
    }

    public ItineraryPrice getItineraryPrice() {
        return itineraryPrice;
    }

    public void setItineraryPrice(ItineraryPrice itineraryPrice) {
        this.itineraryPrice = itineraryPrice;
    }

}
