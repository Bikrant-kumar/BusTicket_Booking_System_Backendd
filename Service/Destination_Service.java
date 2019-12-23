package org.springframework.boot.Bus_Ticket_Booking_System.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Bus_Ticket_Booking_System.Model.Destination;
import org.springframework.boot.Bus_Ticket_Booking_System.Repository.Destination_Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Destination_Service {

    @Autowired
    private Destination_Repository destination_repository;

    public Destination addDestination(Destination destination){
        return destination_repository.save(destination);
    }


    public Optional<Destination> getDestinationById(int id ){
        return destination_repository.findById(id);
    }


    public ResponseEntity<?> deleteDestinationById(int id){
        if(destination_repository.existsById(id)){
            destination_repository.deleteById(id);
            return  new ResponseEntity<>("Delete Success", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

    public int getDestinationId (String destination){
        return destination_repository.getDestinationId(destination);
    }

//    public int checkId(String destination){
//        return destination_repository.checkId(destination);
//    }

    public List<Destination> getAllDestination() {
        return destination_repository.findAll();
    }
}
