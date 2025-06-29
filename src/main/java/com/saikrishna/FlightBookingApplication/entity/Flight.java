package com.saikrishna.FlightBookingApplication.entity;

import org.springframework.stereotype.Component;

@Component
public class Flight {
    private String flightNumber;
    private String source;
    private String destination;

    public Flight(){

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight( String flightNumber, String source, String destination) {
        this.source = source;
        this.destination = destination;
        this.flightNumber = flightNumber;
    }
}
