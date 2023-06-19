package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "seat_type")
public class SeatType {
    @Id
    @Column(name = "seat_type_id")
    private int seatTypeId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "seatType")
    private List<BoardingPass> boardingPasses;

}
