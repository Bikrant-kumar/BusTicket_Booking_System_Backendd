package org.springframework.boot.Bus_Ticket_Booking_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Company;
import org.springframework.boot.Bus_Ticket_Booking_System.Service.Bus_Company_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Bus_Company_Controller {

    @Autowired
    private Bus_Company_Service bus_company_service;

    @PostMapping(value="/buscompany")
    public ResponseEntity<Bus_Company>addBusCompany(@RequestBody final Bus_Company bus_company){
        return new ResponseEntity(bus_company_service.addBusCompany(bus_company),HttpStatus.OK);
    }

    @GetMapping(value ="/buscompany/{id}")
    public ResponseEntity<?> getCompaniesById(@PathVariable int id){
       return new ResponseEntity(bus_company_service.getCompaniesById(id), HttpStatus.OK);
    }

    @DeleteMapping(value ="/buscompany/{id}")
    public ResponseEntity deleteCompaniesById(@PathVariable int id){
        return new ResponseEntity(bus_company_service.deleteCompaniesById(id), HttpStatus.OK);
    }

//    @PathVariable(value = "/buscompany/{id}/")
//    public ResponseEntity updateCompanyById(@PathVariable int id){
//        return  new ResponseEntity(bus_company_service.updateCompanyById(id),HttpStatus.OK);
//    }
}
