package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="destinations")
public class Destination {

    @Id
    @GeneratedValue
    private Integer Destination_id;
    @NotNull
    private String Destination_Name;
    @NotNull
    private String Destination_Address;

    public Destination(){}

    public Destination(Integer destination_id, @NotNull String destination_Name, @NotNull String destination_Address) {
        Destination_id = destination_id;
        Destination_Name = destination_Name;
        Destination_Address = destination_Address;
    }

    public Integer getDestination_id() {
        return Destination_id;
    }

    public void setDestination_id(Integer destination_id) {
        Destination_id = destination_id;
    }

    public String getDestination_Name() {
        return Destination_Name;
    }

    public void setDestination_Name(String destination_Name) {
        Destination_Name = destination_Name;
    }

    public String getDestination_Address() {
        return Destination_Address;
    }

    public void setDestination_Address(String destination_Address) {
        Destination_Address = destination_Address;
    }
}
