package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
@Table(name="Trip")
public class Trip {

    @Id
    @GeneratedValue
    private Integer Trip_id;

    @NotNull
    private Integer AvailableSeat;

    @NotNull
    private Float Cost;

    @NotNull
    private Date Trip_Date;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Route_id",nullable = false)
    private Routes routes;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="bus_id",nullable = false)
    private Bus_Details bus_details;

    public Trip(){}

    public Trip(Integer trip_id, @NotNull Integer availableSeat, @NotNull Float cost, @NotNull Date trip_Date, Routes routes, Bus_Details bus_details) {
        Trip_id = trip_id;
        AvailableSeat = availableSeat;
        Cost = cost;
        Trip_Date = trip_Date;
        this.routes = routes;
        this.bus_details = bus_details;
    }

    public Integer getTrip_id() {
        return Trip_id;
    }

    public void setTrip_id(Integer trip_id) {
        Trip_id = trip_id;
    }

    public Integer getAvailableSeat() {
        return AvailableSeat;
    }

    public void setAvailableSeat(Integer availableSeat) {
        AvailableSeat = availableSeat;
    }

    public Float getCost() {
        return Cost;
    }

    public void setCost(Float cost) {
        Cost = cost;
    }

    public Date getTrip_Date() {
        return Trip_Date;
    }

    public void setTrip_Date(Date trip_Date) {
        Trip_Date = trip_Date;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public Bus_Details getBus_details() {
        return bus_details;
    }

    public void setBus_details(Bus_Details bus_details) {
        this.bus_details = bus_details;
    }
}
