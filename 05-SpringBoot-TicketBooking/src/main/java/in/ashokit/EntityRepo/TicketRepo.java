package in.ashokit.EntityRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket,Long> {

}
