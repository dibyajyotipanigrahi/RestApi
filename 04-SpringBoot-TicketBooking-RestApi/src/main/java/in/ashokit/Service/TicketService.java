package in.ashokit.Service;

import java.util.List;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

public interface TicketService {
	public Ticket bookTicket(Passenger p);

	public Ticket getTicket(Integer Id);

	public List<Ticket> getAllTicket();

}
