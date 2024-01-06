package com.example.restaurantservice.Repositories;

import com.example.restaurantservice.Models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository  extends JpaRepository<Adresse,Integer> {
}
