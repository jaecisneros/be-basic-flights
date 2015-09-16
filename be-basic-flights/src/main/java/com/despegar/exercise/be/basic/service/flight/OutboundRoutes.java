package com.despegar.exercise.be.basic.service.flight;

import java.util.List;

public class OutboundRoutes {

    private List<Segment> segments;

    public OutboundRoutes() {

    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

}
