package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Trip;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.TripRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Trip_Service {

    @Autowired
    private TripRepository trip_repository;

    public Trip addTrip(Trip trip){
        return trip_repository.save(trip);
    }

    public List<Trip> findByRouteId(int routeId, String date){
        return trip_repository.findByRoutesAndTrip_Date(routeId,date);
    }

    public Optional<Trip>getTripById(int id ){
        return trip_repository.findById(id);
    }


    public ResponseEntity<?>deleteTripById(int id){
        if(trip_repository.existsById(id)){
            trip_repository.deleteById(id);
            return  new ResponseEntity<>("Delete Success", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }


}
