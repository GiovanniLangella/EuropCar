package com.example.europcar.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "HB_AREA")
public class Area {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome_area")
    private int nome_area;

    @Column(name = "investimenti")
    private String investimenti;

}
