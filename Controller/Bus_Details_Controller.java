package org.springframework.boot.Bus_Ticket_Booking_System.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Company;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Details;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Bus_Details_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class Bus_Details_Controller {

    @Autowired
    private Bus_Details_Service bus_details_service;

    @PostMapping(value ="/busdetails")
    public ResponseEntity<Bus_Details> addBusDetails(@RequestBody final Bus_Details bus_details){
        return new ResponseEntity(bus_details_service.addBusDetails(bus_details), HttpStatus.OK);
    }

    @GetMapping(value ="/busdetails/{id}")
    public ResponseEntity<?> getDetailsById(@PathVariable int id){
        return new ResponseEntity(bus_details_service.getDetailsById(id), HttpStatus.OK);
    }

    @DeleteMapping(value ="/busdetails/{id}")
    public ResponseEntity deleteDetailsById(@PathVariable int id){
        return new ResponseEntity(bus_details_service.deleteDetailsById(id), HttpStatus.OK);
    }
}
