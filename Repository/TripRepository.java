package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.sql.Date;
import java.util.List;

public interface TripRepository extends CrudRepository <Trip,Integer> {

    @Query(
            value = "select * from trip t join routes r on t.route_id=r.route_id join bus_details b on t.bus_id =b.bus_id  where t.route_id=?1 and trip_date=?2",
            nativeQuery = true
    )
    List<Trip> findByRoutesAndTrip_Date(int routeId,String date);

}
