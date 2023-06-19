package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "airplane")
public class Airplane {
    @Id
    @Column(name = "airplane_id")
    private int airplaneId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "airplane")
    private List<Seat> seats;

    @OneToMany(mappedBy = "airplane")
    private List<Flight> flights;
}
