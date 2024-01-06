package com.example.kitchenservice.Services;


import com.example.kitchenservice.Models.Ticket;
import com.example.kitchenservice.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public boolean createTicket(Ticket t) {
        try {
            ticketRepository.save(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean acceptTicket(String id) {
        try {
            Ticket t = ticketRepository.findById(id).get();
            t.setState("accepted");
            ticketRepository.save(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean readyForPickUp(String id){
        try {
            Ticket t = ticketRepository.findById(id).get();
            t.setState("ready");
            ticketRepository.save(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}