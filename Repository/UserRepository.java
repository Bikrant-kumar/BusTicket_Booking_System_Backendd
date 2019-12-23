package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
}
