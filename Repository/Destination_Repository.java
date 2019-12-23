package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Destination_Repository extends JpaRepository <Destination,Integer> {

     List<Destination> findAll();

     @Query(
             value = "select destination_id from destinations where destination_name=?1",
             nativeQuery = true
     )
     int getDestinationId(String destination);

//     @Query(
//             value = "select count(destination_id) from destinations where destination_name=?1",
//             nativeQuery = true )
//     int checkId(String destination);

}
