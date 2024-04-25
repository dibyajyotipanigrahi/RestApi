package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Passenger;
import in.ashokit.Entity.Ticket;
import in.ashokit.EntityRepo.PassengerRepo;
import in.ashokit.EntityRepo.TicketRepo;

@Service
public class ServiceImpl implements Services {

	@Autowired
	private TicketRepo ticketRepo;
	@Autowired
	private PassengerRepo passengerRepo;

	public Ticket bookTicket(Passenger p) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();

		ticket.setTicketStatus("booked");
		ticket.setTrainNum(p.getTrainNum());
		ticket.setTo(p.getTo());
		ticket.setFrom(p.getFrom());
		ticket.setDoj(p.getDoj());
		ticket.setName(p.getName());
		ticketRepo.save(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Long ticketId) {
		Optional<Ticket> byId = ticketRepo.findById(ticketId);
		if (byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		List<Ticket> tickets = ticketRepo.findAll();
		return tickets;
	}

}
