package com.example.kitchenservice.Controllers;

import com.example.kitchenservice.Models.Ticket;
import com.example.kitchenservice.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
@CrossOrigin("*")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/create")
    public boolean createTicket(@RequestBody Ticket t ) {
        return ticketService.createTicket(t);
    }
    @PostMapping("/accept")
    public boolean acceptTicket(@RequestParam(name = "id") String id) {
        return ticketService.acceptTicket(id);
    }
    @PostMapping("/ready")
    public boolean readyForPickUp(@RequestParam(name = "id") String id) {
        return ticketService.readyForPickUp(id);
    }

}
