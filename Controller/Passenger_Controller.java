package org.springframework.boot.Bus_Ticket_Booking_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Passenger;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Passenger_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Passenger_Controller {

    @Autowired
    private Passenger_Service passenger_service;

    @PostMapping(value ="/passenger")
    public ResponseEntity<Passenger> addPassenger(@RequestBody final Passenger passenger){
        return new ResponseEntity(passenger_service.addPassenger(passenger), HttpStatus.OK);
    }

    @GetMapping(value ="/passenger/{id}")
    public ResponseEntity<?> getPassengerById(@PathVariable int id){
        return new ResponseEntity(passenger_service.getPassengerById(id), HttpStatus.OK);
    }

}
