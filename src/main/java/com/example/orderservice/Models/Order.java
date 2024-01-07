package com.example.orderservice.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "orders")
public class Order {

    @Id
    private int id;
    private OrderState state;
    private String consumerId;
    private String restaurantId;
}
