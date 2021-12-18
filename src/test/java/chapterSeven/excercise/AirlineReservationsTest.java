//package chapterSeven.excercise;
//
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//
//public class AirlineReservationsTest {
//
//    private final AirlineReservations airlineReservations = new AirlineReservations();
//
//    @BeforeEach
//    public void setAirlineReservations(){}
//
//    @Test
//    public void assertThatAirlineReservationClassIsNotEmpty(){
//        AirlineReservations reservations = new AirlineReservations();
//        Assertions.assertNotNull(reservations);
//    }
//
//    @Test
//    public void test_passengerCanReceiveWelcomeMessage(){
//        String messageVariable = airlineReservations.sendWelcomeMessageToCustomers();
//        Assertions.assertNotNull(messageVariable);
//    }
//
//    @Test
//    public void test_passengerCanBookFirstClassFlight(){
//        boolean value = airlineReservations.createFirstClassCustomersSeatReservation("firstClass");
//        Assertions.assertTrue(value);
//    }
//
//    @Test
//    public void test_passengerCanBookEconomyFlight(){
//        boolean value = airlineReservations.createEconomyCustomersSeatReservation("economy");
//        Assertions.assertTrue(value);
//    }
//
//    @Test
//    public void test_passengerCanGetAReserveSeat() {
//        int isTrue = airlineReservations.assignSeatForFirstClassPassenger("firstClass");
//        Assertions.assertTrue(true);
//    }
//}