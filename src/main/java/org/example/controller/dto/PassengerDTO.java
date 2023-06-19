package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PassengerDTO {
    private int passengerId;
    private String dni;
    private String name;
    private int age;
    private String country;
    private int boardingPassId;
    private int purchaseId;
    private int seatTypeId;
    private int seatId;
}
