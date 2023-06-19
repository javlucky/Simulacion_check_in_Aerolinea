package org.example.controller;


import org.example.controller.dto.FlightDTO;
import org.example.controller.dto.PassengerDTO;
import org.example.model.BoardingPass;
import org.example.model.Flight;
import org.example.model.Passenger;
import org.example.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/{id}/passengers")
    public ResponseEntity<?> getFlightPassengers(@PathVariable("id") int flightId) {
        try {
            Flight flight = flightService.getFlightById(flightId);
            if (flight == null) {
                return ResponseEntity.notFound().build();
            }

            FlightDTO flightDTO = convertToDTO(flight);
            return ResponseEntity.ok(flightDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Could not connect to db");
        }
    }

    private FlightDTO convertToDTO(Flight flight) {
        FlightDTO flightDTO = new FlightDTO(
                flight.getFlightId(),
                flight.getTakeoffDateTime(),
                flight.getTakeoffAirport(),
                flight.getLandingDateTime(),
                flight.getLandingAirport(),
                flight.getAirplane().getAirplaneId(),
                null
        );

        List<PassengerDTO> passengerDTOs = new ArrayList<>();
        List<BoardingPass> boardingPasses = flight.getBoardingPasses();
        for (BoardingPass boardingPass : boardingPasses) {
            Passenger passenger = boardingPass.getPassenger();
            PassengerDTO passengerDTO = new PassengerDTO(
                    passenger.getPassengerId(),
                    passenger.getDni(),
                    passenger.getName(),
                    passenger.getAge(),
                    passenger.getCountry(),
                    boardingPass.getBoardingPassId(),
                    boardingPass.getPurchase().getPurchaseId(),
                    boardingPass.getSeatType().getSeatTypeId(),
                    boardingPass.getSeat().getSeatId()
            );

            passengerDTOs.add(passengerDTO);
        }
        flightDTO.setPassengers(passengerDTOs);

        return flightDTO;
    }
}
