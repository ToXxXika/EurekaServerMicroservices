package com.example.courtierservice.Service;

import com.example.courtierservice.Repositories.LocationRepository;
import org.springframework.stereotype.Service;

@Service

public class LocationService {
    LocationRepository locationRepository ;

    public boolean updateLocation(int id , int longitude , int latitude){
        try{
            locationRepository.findById(id).get().setLatitude(latitude);
            locationRepository.findById(id).get().setLongitude(longitude);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
