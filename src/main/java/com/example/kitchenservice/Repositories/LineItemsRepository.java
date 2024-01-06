package com.example.kitchenservice.Repositories;

import com.example.kitchenservice.Models.LineItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemsRepository  extends JpaRepository<LineItems, Integer> {
}
