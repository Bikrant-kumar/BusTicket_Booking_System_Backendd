package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Ticket;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TicketRepository extends JpaRepository <Ticket,Integer> {

}