package com.saikrishna.FlightBookingApplication.repository;

import com.saikrishna.FlightBookingApplication.entity.Flight;

import java.util.List;

public interface FlightRepository {
    public List<Flight> getFlights();
}
