package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface busDetailsRepository extends JpaRepository <Bus_Details,Integer> {
}
