package com.anasdev.api.ensmr.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


    @Entity
    @Table(name="produit")
    @NoArgsConstructor
    @Getter
    @Setter
    public class Produit {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false, length = 25)
        private String nom;
        @Column(length = 200)
        private String description;
        @Column(precision = 15, scale = 2)
        private BigDecimal prix;
    }

