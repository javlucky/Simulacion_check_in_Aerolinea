package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class FlightDTO {
    private int flightId;
    private int takeoffDateTime;
    private String takeoffAirport;
    private int landingDateTime;
    private String landingAirport;
    private int airplaneId;
    private List<PassengerDTO> passengers;
}
