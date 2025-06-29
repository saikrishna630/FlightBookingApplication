package com.saikrishna.FlightBookingApplication.repository;

import com.saikrishna.FlightBookingApplication.entity.Flight;
import com.saikrishna.FlightBookingApplication.entity.FlightList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightRepositoryImpl implements FlightRepository{

    @Autowired
    FlightList flightList;

    public List<Flight> getFlights() {
        return flightList.getFlights();
    }
}
