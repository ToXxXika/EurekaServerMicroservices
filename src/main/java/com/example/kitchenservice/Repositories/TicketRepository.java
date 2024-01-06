package com.example.kitchenservice.Repositories;

import com.example.kitchenservice.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, String> {
}
