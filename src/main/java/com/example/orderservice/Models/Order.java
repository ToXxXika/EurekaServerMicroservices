package com.example.orderservice.Models;


import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private int id;
    private OrderState state;
    private String consumerId;
    private String restaurantId;
}
