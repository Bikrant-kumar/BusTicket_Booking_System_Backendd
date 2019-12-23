package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Routes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Routes_Repository extends JpaRepository <Routes,Integer> {
    @Query(
            value = "select distinct(r.route_id) from routes r inner join destinations s on r.source=?1 inner join destinations d on r.destination=?2",
            nativeQuery = true
    )
    int getRouteId(int id,int id2);

}
