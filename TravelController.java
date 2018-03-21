package com.cgi.travel.controllers;

import java.util.Hashtable;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.travel.models.Flight;

@RestController
public class TravelController {

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
	public Hashtable<Integer, String> getFlightData() {
		Hashtable<Integer, String> flightData = new Hashtable<Integer, String>();
		flightData.put(11111, "Indigo");
		flightData.put(22222, "Spicejet");
		return flightData;
	}

	@RequestMapping(path = "/addData", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public String getFlight(@ModelAttribute Flight flight) {
		if (flight != null) {
			return flight.getServiceOperator();
		} else
			return "No record found";
	}

}
