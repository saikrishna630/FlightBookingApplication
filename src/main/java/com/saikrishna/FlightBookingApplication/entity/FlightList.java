package com.saikrishna.FlightBookingApplication.entity;

import java.util.List;

public interface FlightList {
    public void addFlight(Flight flight);
    public List<Flight> getFlights();
}
