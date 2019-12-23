package org.springframework.boot.Bus_Ticket_Booking_System.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Routes;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.Destination_Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Destination_Service;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Routes_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Routes_Controller {

    @Autowired
    private Routes_Service routes_service;
    @Autowired
    private Destination_Service destination_service;
    @Autowired
    private Destination_Repository destination_repository;

    @PostMapping(value ="/routes")
    public ResponseEntity<Routes> addRoutes(@RequestBody final Routes routes){
        return new ResponseEntity(routes_service.addRoutes(routes), HttpStatus.OK);
    }

    @GetMapping(value ="/routes/{id}")
    public ResponseEntity<?> getRoutesById(@PathVariable int id){
        return new ResponseEntity(routes_service.getRoutesById(id), HttpStatus.OK);
    }

    @DeleteMapping(value ="/routes/{id}")
    public ResponseEntity deleteDestinationById(@PathVariable int id){
        return new ResponseEntity(routes_service.deleteRoutesById(id), HttpStatus.OK);
    }

    @GetMapping(value="/routes/{source}/{destination}")
    public ResponseEntity getRouteId(@PathVariable String source,@PathVariable String destination){
        int sourceId= destination_service.getDestinationId(source);
        int destinationId=destination_service.getDestinationId(destination);
        return new ResponseEntity(routes_service.getRouteId(sourceId,destinationId),HttpStatus.OK);
    }
}
