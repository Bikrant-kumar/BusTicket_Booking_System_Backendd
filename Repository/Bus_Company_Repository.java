package org.springframework.boot.Bus_Ticket_Booking_System.Repository;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Bus_Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bus_Company_Repository extends JpaRepository <Bus_Company,Integer>{
//    public Bus_Company findByCompnayName(String company_Name);
}
