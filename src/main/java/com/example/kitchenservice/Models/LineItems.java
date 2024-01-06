package com.example.kitchenservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LineItems {
    @Id
    @GeneratedValue
    private int id;
    private int quantite;
    private int idMenu;
    private int idTicket;
}
