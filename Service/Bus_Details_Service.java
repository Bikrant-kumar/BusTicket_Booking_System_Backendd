package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Details;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.busDetailsRepository;

import java.util.Optional;

@Service
public class Bus_Details_Service {

    @Autowired
    private busDetailsRepository bus_details_repository;

    public Bus_Details addBusDetails(Bus_Details bus_details){
//        if(bus_company.getCompanyName()==null || bus_company.getRating()==null
        return bus_details_repository.save(bus_details);
    }


    public Optional<Bus_Details> getDetailsById(int id ){
        return bus_details_repository.findById(id);
    }


    public ResponseEntity<?> deleteDetailsById(int id){
        if(bus_details_repository.existsById(id)){
            bus_details_repository.deleteById(id);
            return  new ResponseEntity<>("Delete Success", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

}
