package org.springframework.boot.Bus_Ticket_Booking_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Trip;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Destination_Service;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Routes_Service;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Trip_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Trip_Controller {

    @Autowired
    private Trip_Service trip_service;
    @Autowired
    private Routes_Service routes_service;
    @Autowired
    private Destination_Service destination_service;

    @PostMapping(value ="/trip")
    public ResponseEntity<Trip> addTrip(@RequestBody final Trip trip){
        return new ResponseEntity(trip_service.addTrip(trip), HttpStatus.OK);
    }

    @GetMapping(value="/trip/{source}/{destination}/{date}")
    public ResponseEntity<?> getTripByRouteId(@PathVariable String source,@PathVariable String destination,@PathVariable String date){
        int sourceId = destination_service.getDestinationId(source);
        int destinationId = destination_service.getDestinationId(destination);
        if(sourceId == destinationId){
            return new ResponseEntity<>("Source and Destination are same",HttpStatus.NOT_FOUND);
        }
        else{
            int routeId = routes_service.getRouteId(sourceId,destinationId);
            System.out.println(routeId);
            return new ResponseEntity(trip_service.findByRouteId(routeId,date),HttpStatus.OK);
        }
    }

    @GetMapping(value ="/trip/{id}")
    public ResponseEntity<?> getTripById(@PathVariable int id){
        return new ResponseEntity(trip_service.getTripById(id), HttpStatus.OK);
    }

    @DeleteMapping(value ="/trip/{id}")
    public ResponseEntity deleteTripById(@PathVariable int id){
        return new ResponseEntity(trip_service.deleteTripById(id), HttpStatus.OK);
    }
}
