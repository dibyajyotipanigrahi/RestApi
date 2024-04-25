package in.ashokit.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Repository.TicketRepository;
import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepository ticketRepo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketStatus("Confirmed");
		Ticket ticket = ticketRepo.save(t);
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer Id) {
		return ticketRepo.findById(Id).orElseThrow();

	}

	@Override
	public List<Ticket> getAllTicket() {
		return ticketRepo.findAll();

	}

}
