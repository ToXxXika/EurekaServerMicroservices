package com.example.restaurantservice.Repositories;

import com.example.restaurantservice.Models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepositroy extends JpaRepository<Menu,Integer> {
    @Query("select m from menu m where m.nom = ?1")
    List<Menu> findRestaurantMenu(String nomMenu);
}
