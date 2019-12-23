package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="Bus_Details")
public class Bus_Details {

    @Id
    @GeneratedValue
    private Integer bus_id;
    @NotNull
    private String bus_name;
    @NotNull
    private String bus_type;
    private Float bus_rating;
    @NotNull
    private Integer bus_totalSeat;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Company_id",nullable = false)
    private Bus_Company bus_company;

    public Bus_Details(){}

    public Bus_Details(Integer bus_id, @NotNull String bus_name, @NotNull String bus_type, Float bus_rating, @NotNull Integer bus_totalSeat, Bus_Company bus_company) {
        this.bus_id = bus_id;
        this.bus_name = bus_name;
        this.bus_type = bus_type;
        this.bus_rating = bus_rating;
        this.bus_totalSeat = bus_totalSeat;
        this.bus_company = bus_company;
    }

    public Integer getBus_id() {
        return bus_id;
    }

    public void setBus_id(Integer bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }

    public Float getBus_rating() {
        return bus_rating;
    }

    public void setBus_rating(Float bus_rating) {
        this.bus_rating = bus_rating;
    }

    public Integer getBus_totalSeat() {
        return bus_totalSeat;
    }

    public void setBus_totalSeat(Integer bus_totalSeat) {
        this.bus_totalSeat = bus_totalSeat;
    }

    public Bus_Company getBus_company() {
        return bus_company;
    }

    public void setBus_company(Bus_Company bus_company) {
        this.bus_company = bus_company;
    }
}

