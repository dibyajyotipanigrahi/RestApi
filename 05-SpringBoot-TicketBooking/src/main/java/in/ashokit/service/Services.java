package in.ashokit.service;

import java.util.List;

import in.ashokit.Entity.Passenger;
import in.ashokit.Entity.Ticket;

public interface Services {
	public Ticket bookTicket( Passenger p);
	public Ticket getTicket(Long ticketId);
	public List<Ticket>  getAllTicket();

}
