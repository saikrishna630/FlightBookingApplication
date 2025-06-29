package com.saikrishna.FlightBookingApplication.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightListImpl implements FlightList{

    List<Flight> flightList;

    public FlightListImpl(){
        this.flightList=new ArrayList<>();
        flightList.add(new Flight("F0001","Hyderabad","Chennai"));
        flightList.add(new Flight("F0002","Hyderabad","Bangalore"));
        flightList.add(new Flight("F0003","Bangalore","Chennai"));
        flightList.add(new Flight("F0004","Chennai","Delhi"));
        flightList.add(new Flight("F0005","Chennai","Delhi"));
        flightList.add(new Flight("F0006","Hyderabad","Chennai"));
        flightList.add(new Flight("F0007","Hyderabad","Bangalore"));
        flightList.add(new Flight("F0008","Bangalore","Delhi"));
        flightList.add(new Flight("F0009","Hyderabad","Chennai"));
        flightList.add(new Flight("F0010","Bangalore","Chennai"));
        flightList.add(new Flight("F0011","Kolkata","Chennai"));
        flightList.add(new Flight("F0012","Bangalore","Delhi"));
    }

    public void addFlight(Flight flight) {
        this.flightList.add(flight);
    }

    public List<Flight> getFlights() {
        return this.flightList;
    }

}
