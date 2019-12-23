package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Company;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.Bus_Company_Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Bus_Company_Service {
    @Autowired
    private Bus_Company_Repository bus_company_repository;


    public Bus_Company addBusCompany(Bus_Company bus_company){
        return bus_company_repository.save(bus_company);
    }


    public Optional<Bus_Company> getCompaniesById(int id ){
        return bus_company_repository.findById(id);
    }


    public ResponseEntity<?> deleteCompaniesById(int id){
        if(bus_company_repository.existsById(id)){
            bus_company_repository.deleteById(id);
            return  new ResponseEntity<>("Delete Success", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

}
