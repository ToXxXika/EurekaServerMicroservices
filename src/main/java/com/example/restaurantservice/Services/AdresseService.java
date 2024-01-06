package com.example.restaurantservice.Services;

import com.example.restaurantservice.Models.Adresse;
import com.example.restaurantservice.Repositories.AdresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService {
   AdresseRepository adresseRepository;

   public List<Adresse> findAvailableRestaurants(String ville){
       List<Adresse> lst =  adresseRepository.findAll();
       lst.forEach(adresse -> {
           if(!adresse.getVille().equals(ville)){
               lst.remove(adresse);
           }
       });
         return lst;
   }
}
