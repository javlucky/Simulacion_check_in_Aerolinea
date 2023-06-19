package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @Column(name = "purchase_id")
    private int purchaseId;

    @Column(name = "purchase_date")
    private int purchaseDate;

    @OneToMany(mappedBy = "purchase")
    private List<BoardingPass> boardingPasses;
}
