package org.example.services;


import org.example.model.Flight;
import org.example.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight getFlightById(int flightId) {
        return flightRepository.findById(flightId).orElse(null);
    }
}
