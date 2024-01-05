package com.example.orderservice.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderLineItems {
  private int id ;
  private int quantite ;
  private int idMenu;
  private int idOrder;

}
