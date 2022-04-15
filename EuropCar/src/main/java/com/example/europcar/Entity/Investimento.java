package com.example.europcar.Entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "HB_INVESTIMENTO")

public class Investimento {


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "totale_investimento")
    private String totale_investimento;

    @Column(name = "data_investimento")
    private String data_investimento;

    @Column(name = "categoria")
    private String categoria;



}
