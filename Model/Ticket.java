package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import lombok.Data;
import lombok.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private Integer ticket_id;

    @NotNull
    private Date Ticket_Date;

    @NotNull
    private String Payment_Method;

    @NotNull
    private Integer No_of_Passenger;

    @NotNull
    private Float Amount_Paid;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="User_id",nullable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="Trip_id",nullable = false)
    private Trip trip;

    public Ticket(){}

    public Ticket(Integer ticket_id, @NotNull Date ticket_Date, @NotNull String payment_Method, @NotNull Integer no_of_Passenger, @NotNull Float amount_Paid, User user, Trip trip) {
        this.ticket_id = ticket_id;
        Ticket_Date = ticket_Date;
        Payment_Method = payment_Method;
        No_of_Passenger = no_of_Passenger;
        Amount_Paid = amount_Paid;
        this.user = user;
        this.trip = trip;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Date getTicket_Date() {
        return Ticket_Date;
    }

    public void setTicket_Date(Date ticket_Date) {
        Ticket_Date = ticket_Date;
    }

    public String getPayment_Method() {
        return Payment_Method;
    }

    public void setPayment_Method(String payment_Method) {
        Payment_Method = payment_Method;
    }

    public Integer getNo_of_Passenger() {
        return No_of_Passenger;
    }

    public void setNo_of_Passenger(Integer no_of_Passenger) {
        No_of_Passenger = no_of_Passenger;
    }

    public Float getAmount_Paid() {
        return Amount_Paid;
    }

    public void setAmount_Paid(Float amount_Paid) {
        Amount_Paid = amount_Paid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
