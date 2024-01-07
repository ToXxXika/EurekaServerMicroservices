package com.example.orderservice.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "deliveryinfo")
public class DeliveryInfo {

     private int deliveryTime ;
     @Id
     private String deliveryAddress ;
}
