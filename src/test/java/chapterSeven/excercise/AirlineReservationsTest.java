package chapterSeven.excercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirlineReservationsTest {
	
	private AirlineReservations airlineReservations;
	
	@BeforeEach
	public void setAirlineReservations(){
		airlineReservations = new AirlineReservations();
	}
	
	@Test
	public void assertAirlineReservationClassIsNotNull(){
		AirlineReservations reservations = new AirlineReservations();
		Assertions.assertNotNull(reservations);
	}
	
	@Test
	public void test_registerPassenger(){
		String v = airlineReservations.registerPassenger("Lanre ", "Kenny");
		Assertions.assertNotNull(v);
	}
	
	@Test
	public void test_receiveWelcomeMessage(){
		airlineReservations.receiveWelcomeMessage();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void test_displayFirstClassSeat(){
		airlineReservations.displayFirstClassSeat();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void test_displayEconomySeat(){
		airlineReservations.displayEconomySeat();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void test_registerSeatForFirstClassPassenger(){
		int v = airlineReservations.registerSeatForFirstClassPassenger(9);
		Assertions.assertEquals(v, 9);
	}
}