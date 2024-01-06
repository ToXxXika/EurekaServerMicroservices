package com.example.courtierservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "courtier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Courtier {

    @Id
     String cin;
     String nom;
     int telephone;
     boolean disponible;

}
