package in.ashokit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Entity.Passenger;
import in.ashokit.Entity.Ticket;
import in.ashokit.service.ServiceImpl;

@RestController
public class PassangerRestController {

	@Autowired
	private ServiceImpl service;

	@PostMapping("/bookTicket")
	public ResponseEntity<Ticket> bookTickets(@RequestBody Passenger p) {
		Ticket bookTicket = service.bookTicket(p);
		if (!(bookTicket == null)) {
			return new ResponseEntity<>(bookTicket, HttpStatus.CREATED);
		}
		return null;
	}

	@GetMapping("/get/{ticketId}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketId") Long ticketId) {
		Ticket ticket = service.getTicket(ticketId);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}

	public ResponseEntity<List<Ticket>> getAllTicket() {
		List<Ticket> allTicket = service.getAllTicket();
		return new ResponseEntity<>(allTicket, HttpStatus.OK);
	}
}
