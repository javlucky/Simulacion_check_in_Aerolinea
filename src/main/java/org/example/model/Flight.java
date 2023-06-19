package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_id")
    private int flightId;

    @Column(name = "takeoff_date_time")
    private int takeoffDateTime;

    @Column(name = "takeoff_airport")
    private String takeoffAirport;

    @Column(name = "landing_date_time")
    private int landingDateTime;

    @Column(name = "landing_airport")
    private String landingAirport;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @OneToMany(mappedBy = "flight")
    private List<BoardingPass> boardingPasses;
}
