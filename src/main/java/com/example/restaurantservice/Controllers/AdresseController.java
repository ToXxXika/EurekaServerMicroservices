package com.example.restaurantservice.Controllers;

import com.example.restaurantservice.Models.Adresse;
import com.example.restaurantservice.Services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adresse")
@CrossOrigin("*")
public class AdresseController {

    @Autowired
    AdresseService adresseService;

    @GetMapping("/all")
    public List<Adresse> findAvailableRestaurants(@RequestParam(name = "ville") String ville){
        return adresseService.findAvailableRestaurants(ville);
    }
}
