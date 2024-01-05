package com.example.orderservice.Controllers;

import com.example.orderservice.Models.Order;
import com.example.orderservice.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public boolean CreateOrder(@RequestBody Order o){
        return orderService.CreateOrder(o);
    }
}
