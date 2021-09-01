package chapterSeven.excercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirlineReservationsTest {
	
	private AirlineReservations airlineReservations;
	
	@BeforeEach
	public void SetUp(){
		airlineReservations = new AirlineReservations();
	}

	@Test
	public void userPurchasedFirstClassSeat(){
		airlineReservations.firstClassSeatPicker(1);
		Assertions.assertEquals(1, airlineReservations.getFirstClassSeatResult());
	}
	
	@Test
	public void userPurchasedEconomySeat(){
		airlineReservations.economySeatPicker(6);
		Assertions.assertEquals(6, airlineReservations.getEconomySeatResults());
	}
	
	@Test
	public void firstClassUser(){
		airlineReservations.firstClassSeatArray(1, 2);
		Assertions.assertEquals();
	}
}