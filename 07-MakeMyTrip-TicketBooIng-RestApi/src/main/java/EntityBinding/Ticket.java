package EntityBinding;

public class Ticket {

	
	private Integer ticketId;
	private String ticketStatus;
	private String trainNum;
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String destination;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
}
