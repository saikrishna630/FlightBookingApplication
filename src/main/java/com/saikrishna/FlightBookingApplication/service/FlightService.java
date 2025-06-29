package com.saikrishna.FlightBookingApplication.service;

import com.saikrishna.FlightBookingApplication.entity.Flight;
import com.saikrishna.FlightBookingApplication.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getFlightsBySrcAndDst(String src,String dst){
        List<Flight> flights=flightRepository.getFlights();
        return flights.stream().
                filter(
                        flight->flight.getSource().equalsIgnoreCase(src)
                                && flight.getDestination().equalsIgnoreCase(dst)
                ).collect(Collectors.toList());
    }
}
