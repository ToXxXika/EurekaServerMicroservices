package com.example.orderservice.Services;

import com.example.orderservice.Models.Order;
import com.example.orderservice.Models.OrderState;
import com.example.orderservice.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;


    public boolean CreateOrder(Order o){
        try{
            orderRepository.save(o);
            return true;
        }catch(Exception e){
            return false;
        }
    }


    public boolean CancelOrder(int id){
        try{
            Order o = orderRepository.findById(id).get();
            o.setState(OrderState.CANCELED);
            orderRepository.save(o);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
