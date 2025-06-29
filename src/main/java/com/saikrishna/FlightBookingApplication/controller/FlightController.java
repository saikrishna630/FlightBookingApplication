package com.saikrishna.FlightBookingApplication.controller;

import com.saikrishna.FlightBookingApplication.entity.Flight;
import com.saikrishna.FlightBookingApplication.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    @RequestMapping
    public String search(){
        return "home";
    }

    @RequestMapping(value = "/flights",method = RequestMethod.POST)
    public String searchFlight(@RequestParam("source") String source, @RequestParam("destination") String destination, Model model){
        List<Flight> flightsListBySrcAndDst=flightService.getFlightsBySrcAndDst(source,destination);
        model.addAttribute("flightsList",flightsListBySrcAndDst);
        return "success";
    }
}
