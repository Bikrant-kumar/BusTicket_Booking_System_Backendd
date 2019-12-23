package org.springframework.boot.Bus_Ticket_Booking_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Destination;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Destination_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Destination_Controller {

    @Autowired
    private Destination_Service destination_service;

    @PostMapping(value ="/destination")
    public ResponseEntity<Destination> addDestination(@RequestBody final Destination destination){
        return new ResponseEntity(destination_service.addDestination(destination), HttpStatus.OK);
    }

    @GetMapping(value ="/destination/{id}")
    public ResponseEntity<?> getDestinationById(@PathVariable int id){
        return new ResponseEntity(destination_service.getDestinationById(id), HttpStatus.OK);
    }

    @GetMapping(value ="/destination")
    public ResponseEntity<?> getAllDestination(){
        return new ResponseEntity(destination_service.getAllDestination(), HttpStatus.OK);
    }

//    @GetMapping(value="/destinationid/{destination}")
//    public ResponseEntity getDestinationId(@PathVariable String destination){
//        if (destination_service.checkId(destination) == 1) {
//            return new ResponseEntity(destination_service.getDestinationId(destination), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Not Found Data", HttpStatus.NOT_FOUND);
//        }
//    }

    @DeleteMapping(value ="/destination/{id}")
    public ResponseEntity deleteDestinationById(@PathVariable int id){
        return new ResponseEntity(destination_service.deleteDestinationById(id), HttpStatus.OK);
    }
}
