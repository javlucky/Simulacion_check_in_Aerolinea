package org.example.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @Column(name = "seat_id")
    private int seatId;

    @Column(name = "seat_column")
    private String seatColumn;

    @Column(name = "seat_row")
    private int seatRow;

    @ManyToOne
    @JoinColumn(name = "seat_type_id")
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @OneToMany(mappedBy = "seat")
    private List<BoardingPass> boardingPasses;
}
