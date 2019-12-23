package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository <Passenger,Integer> {

}
