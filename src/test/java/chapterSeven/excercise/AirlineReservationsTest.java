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
	public void purchasedFirstClassTicket(){
		airlineReservations.firstClassSeatPicker(1);
		Assertions.assertEquals(1, airlineReservations.getSeatResult());
	}
	
	@Test
	public void purchasedEconomyTicket(){
		airlineReservations.economySeatPicker(6);
		Assertions.assertEquals(6, airlineReservations.getEcoSeatResult());
	}
	
	@Test
	public void firstClassReservedSeat(){
		
		airlineReservations.firstClassReservedSeat( 1);
		airlineReservations.firstClassReservedSeat( 1);
		airlineReservations.firstClassReservedSeat( 1);
		airlineReservations.firstClassReservedSeat( 1);
		airlineReservations.firstClassReservedSeat( 1);
		
		Assertions.assertEquals(5, airlineReservations.returnFirstClassReservedSeat());
	}
	
	@Test
	public void economyReservedSeat(){
		
		airlineReservations.economyReservedSeat(2);
		airlineReservations.economyReservedSeat(2);
		airlineReservations.economyReservedSeat(2);
		airlineReservations.economyReservedSeat(2);
		airlineReservations.economyReservedSeat(2);
		
		Assertions.assertEquals(5, airlineReservations.returnEconomyReservedSeat());
	}
}