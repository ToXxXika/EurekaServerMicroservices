package com.example.restaurantservice.Services;

import com.example.restaurantservice.Models.Menu;
import com.example.restaurantservice.Repositories.MenuRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    MenuRepositroy menuRepositroy;

    public List<Menu> findRestaurantMenu(String NomMenu){
        return menuRepositroy.findRestaurantMenu(NomMenu);
    }
}
