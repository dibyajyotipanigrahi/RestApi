package in.ashokit.EntityRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger,Integer>{

}
