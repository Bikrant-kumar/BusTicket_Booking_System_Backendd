package org.springframework.boot.Bus_Ticket_Booking_System.Model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name ="User")
public class User {

    @Id
    @GeneratedValue
    private Integer Id;

    @NotNull
    @Email
    private String Email;

    @NotNull
    private String Password;

    @NotNull
    private Integer PhoneNo;

    public User(){}

    public User(Integer id, @NotNull @javax.validation.constraints.Email String email, @NotNull String password, @NotNull Integer phoneNo) {
        Id = id;
        Email = email;
        Password = password;
        PhoneNo = phoneNo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        PhoneNo = phoneNo;
    }
}
