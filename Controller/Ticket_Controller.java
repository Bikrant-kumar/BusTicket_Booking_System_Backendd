package org.springframework.boot.Bus_Ticket_Booking_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Ticket;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Ticket_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Ticket_Controller {

    @Autowired
    private Ticket_Service ticket_service;

    @PostMapping(value ="/ticket")
    public ResponseEntity<Ticket> addTicket(@RequestBody final Ticket ticket){
        return new ResponseEntity(ticket_service.addTicket(ticket), HttpStatus.OK);
    }

    @GetMapping(value ="/ticket/{id}")
    public ResponseEntity<?> getTicketById(@PathVariable int id){
        return new ResponseEntity(ticket_service.getTicketById(id), HttpStatus.OK);
    }

}
