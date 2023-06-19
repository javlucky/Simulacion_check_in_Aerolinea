package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "passenger_id")
    private int passengerId;

    @Column(name = "dni")
    private String dni;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "passenger")
    private List<BoardingPass> boardingPasses;
}
