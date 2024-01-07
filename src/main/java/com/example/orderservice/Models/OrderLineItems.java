package com.example.orderservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="orderlineitems")
public class OrderLineItems {
  @Id
  @GeneratedValue
  private int id ;
  private int quantite ;
  private int idMenu;
  private int idOrder;

}
