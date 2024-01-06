package com.example.courtierservice.Controllers;

import com.example.courtierservice.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
@CrossOrigin("*")
public class LocationController {

    @Autowired
    LocationService locationService;


    @PostMapping("/update")
    public boolean updateLocation(int id , int longitude , int latitude){
        return locationService.updateLocation(id,longitude,latitude);
    }

}
