package org.springframework.boot.Bus_Ticket_Booking_System.Model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
@Table(name="Bus_Company")
public class Bus_Company {
        @Id
        @GeneratedValue
        private Integer Company_id;
        private String Company_Name;
        @Email
        private String Company_Email;

        private Float Company_Rating;

        public Bus_Company(){}

        public Bus_Company(Integer company_id, String company_Name, @Email String company_Email, Float company_Rating) {
                Company_id = company_id;
                Company_Name = company_Name;
                Company_Email = company_Email;
                Company_Rating = company_Rating;
        }

        public Integer getCompany_id() {
                return Company_id;
        }

        public void setCompany_id(Integer company_id) {
                Company_id = company_id;
        }

        public String getCompany_Name() {
                return Company_Name;
        }

        public void setCompany_Name(String company_Name) {
                Company_Name = company_Name;
        }

        public String getCompany_Email() {
                return Company_Email;
        }

        public void setCompany_Email(String company_Email) {
                Company_Email = company_Email;
        }

        public Float getCompany_Rating() {
                return Company_Rating;
        }

        public void setCompany_Rating(Float company_Rating) {
                Company_Rating = company_Rating;
        }
}
