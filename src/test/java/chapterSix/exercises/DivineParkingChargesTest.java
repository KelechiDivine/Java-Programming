package chapterSix.exercises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DivineParkingChargesTest {

	@Test
	public void testClientHourlyCharges(){
		DivineParkingCharges divineParkingCharges = new DivineParkingCharges();
		divineParkingCharges.parkingCharges(6);
		Assertions.assertEquals(5.0, divineParkingCharges.getParkingCharges());
	}
}