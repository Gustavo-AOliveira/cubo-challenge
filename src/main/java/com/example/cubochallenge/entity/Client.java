package com.example.cubochallenge.entity;

import com.example.cubochallenge.entity.ClientDTO.DataSaveDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(of = "id")
    @Table(name = "Clients")
    @Entity(name = "Client")
    public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private BigDecimal participation;

        public Client(DataSaveDTO dados) {
            this.firstName = dados.firstName();
            this.lastName = dados.lastName();
            this.participation = dados.participation();
        }
        public Client(String firstName, String lastName, BigDecimal participation) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.participation = participation;
        }
    }
