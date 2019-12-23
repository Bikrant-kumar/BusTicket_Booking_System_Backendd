package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="Passenger")
public class Passenger {

    @Id
    @GeneratedValue
    private Integer Passenger_id;

    @NotNull
    private String Name;

    @NotNull
    private String Gender;

    @NotNull
    private Integer Age;

    @NotNull
    private Integer SeatNo;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Ticket_id",nullable = false)
    private Ticket ticket;

    public Passenger(){}

    public Passenger(Integer passenger_id, @NotNull String name, @NotNull String gender, @NotNull Integer age, @NotNull Integer seatNo, Ticket ticket) {
        Passenger_id = passenger_id;
        Name = name;
        Gender = gender;
        Age = age;
        SeatNo = seatNo;
        this.ticket = ticket;
    }

    public Integer getPassenger_id() {
        return Passenger_id;
    }

    public void setPassenger_id(Integer passenger_id) {
        Passenger_id = passenger_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(Integer seatNo) {
        SeatNo = seatNo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
