package MakeMyTripService;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import EntityBinding.Passenger;
import EntityBinding.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakeMyTripService {

	private final String Book_TIcket_Url= "http://localhost:9090/bookTicket";

	private final String Get_Tickets_Url="http://localhost:9090/getAllTicket";

	public Mono<Ticket> bookTicket(Passenger p) {

		WebClient webClient = WebClient.create();

		return webClient.post().uri(Book_TIcket_Url).body(BodyInserters.fromValue(p)).retrieve()
				.bodyToMono(Ticket.class);
	}

	public Mono<Ticket[]> getAllTickets() {
		WebClient webClient = WebClient.create();
		return webClient.get().uri(Get_Tickets_Url).retrieve().bodyToMono(Ticket[].class);
	}

}
