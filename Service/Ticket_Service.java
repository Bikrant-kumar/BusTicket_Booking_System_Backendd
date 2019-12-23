package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Ticket;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Ticket_Service {


    @Autowired
    private TicketRepository ticket_repository;

    public Ticket addTicket(Ticket ticket){
        return ticket_repository.save(ticket);
    }


    public Optional<Ticket> getTicketById(int id ){
        return ticket_repository.findById(id);
    }

}
