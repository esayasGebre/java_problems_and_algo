package java1.designpattern.fasade;

public class FacadeClient {

	public static void main(String[] args) {
		TravelPackageFacade travelBooking = new TravelBookingFacadeImpl();
		travelBooking.book();
	}

}
