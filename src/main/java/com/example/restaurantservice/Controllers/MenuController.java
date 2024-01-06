package com.example.restaurantservice.Controllers;

import com.example.restaurantservice.Models.Menu;
import com.example.restaurantservice.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin("*")
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/all")
    public List<Menu> findRestaurantMenu(@RequestParam(name = "nom") String nomMenu){
        return menuService.findRestaurantMenu(nomMenu);
    }
}
