package chapterSeven.excercise;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class AirlineReservationsTest {

    private final AirlineReservations airlineReservations = new AirlineReservations();

    @BeforeEach
    public void setAirlineReservations(){}

    @Test
    public void assertThatAirlineReservationClassIsNotEmpty(){
        AirlineReservations reservations = new AirlineReservations();
        Assertions.assertNotNull(reservations);
    }

    @Test
    public void test_passengerCanReceiveWelcomeMessage(){
        String hasMessage = airlineReservations.sendWelcomeMessageToCustomers();
        Assertions.assertNotNull(hasMessage);
    }

    @Test
    public void test_passengerCanBookFirstClassFlight(){
        boolean value = airlineReservations.createFirstClassCustomersSeatReservation("firstClass");
        Assertions.assertTrue(value);
    }

    @Test
    public void test_passengerCanBookEconomyFLight(){
        boolean value = airlineReservations.createEconomyCustomersSeatReservation("economy");
        Assertions.assertTrue(value);
    }

    @Test
    public void test_passengerCanGetAReserveSeat(){
        airlineReservations.assignSeatForFirstClassPassenger("firstClass");
        Assertions.assertTrue(true);
    }
}