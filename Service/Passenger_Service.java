package org.springframework.boot.Bus_Ticket_Booking_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Passenger;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.PassengerRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class Passenger_Service {

    @Autowired
    private PassengerRepository passenger_repository;

    public Passenger addPassenger(Passenger passenger){
        return passenger_repository.save(passenger);
    }


    public Optional<Passenger> getPassengerById(int id ){
        return passenger_repository.findById(id);
    }
}
