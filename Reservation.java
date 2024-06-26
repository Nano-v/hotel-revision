import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private double price;
	private String status;
	private Customer customer;
	private Room room;
	private String paymentMethod;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate, double price, String status, Customer customer, Room room, String paymentMethod) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.price = price;
		this.status = status;
		this.customer = customer;
		this.room = room;
		this.paymentMethod = paymentMethod;
	}
	
	public Reservation() {}
	
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDatetoString() {
		return arrivalDate.format(formatter);
	}
	
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDatetoString() {
		return departureDate.format(formatter);
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Room getRoom() {
		return room;
	}

	public String getPaymentMethod(){
		return paymentMethod;
	}
	
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}

	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}
	
	public void print() {
		System.out.println("\n***********************************");
		System.out.println("Arrival Date: "+ arrivalDate.format(formatter));
		System.out.println("Departure Date: "+ departureDate.format(formatter));
		int days = Period.between(arrivalDate, departureDate).getDays();
		System.out.println(days + " Days");
		System.out.println("******* Guest informations *******");
		customer.print();
		System.out.println("******* Room informations *******");
		room.print();
		System.out.println("*********** Total ***********");
		double total = days*room.getPrice();
		System.out.println("Price for room: "+this.price);
		System.out.println("Total price: "+total);
		System.out.println("Payment Status: "+ this.status);
		System.out.println("Payment Method: "+this.paymentMethod);
		System.out.println("***********************************\n");
	}

}
