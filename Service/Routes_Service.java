package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Routes;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.Routes_Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class Routes_Service {

    @Autowired
    private Routes_Repository routes_repository;

    public Routes addRoutes(Routes routes){
        return routes_repository.save(routes);
    }


    public Optional<Routes> getRoutesById(int id ){
        return routes_repository.findById(id);
    }

    public int getRouteId(int source,int destination){
        return routes_repository.getRouteId(source,destination);
    }


    public ResponseEntity<?> deleteRoutesById(int id){
        if(routes_repository.existsById(id)){
            routes_repository.deleteById(id);
            return  new ResponseEntity<>("Delete Success", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }
}
