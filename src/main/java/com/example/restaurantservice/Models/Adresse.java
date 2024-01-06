package com.example.restaurantservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "adresse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Adresse {
 @Id
    int numero;
    String rue;
    String ville;
    String cite ;
    String nom ;
}
