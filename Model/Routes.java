package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import lombok.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="Routes")
public class Routes {

    @Id
    @GeneratedValue
    private Integer Route_id;

    @NotNull
    private Integer Route_distance;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Source",nullable = false)
    private Destination destination1;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Destination",nullable = false)
    private Destination destination2;

    public Routes(){}

    public Routes(Integer route_id, @NotNull Integer route_distance, Destination destination1, Destination destination2) {
        Route_id = route_id;
        Route_distance = route_distance;
        this.destination1 = destination1;
        this.destination2 = destination2;
    }

    public Integer getRoute_id() {
        return Route_id;
    }

    public void setRoute_id(Integer route_id) {
        Route_id = route_id;
    }

    public Integer getRoute_distance() {
        return Route_distance;
    }

    public void setRoute_distance(Integer route_distance) {
        Route_distance = route_distance;
    }

    public Destination getDestination1() {
        return destination1;
    }

    public void setDestination1(Destination destination1) {
        this.destination1 = destination1;
    }

    public Destination getDestination2() {
        return destination2;
    }

    public void setDestination2(Destination destination2) {
        this.destination2 = destination2;
    }
}
