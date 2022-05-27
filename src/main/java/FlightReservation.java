import enums.FlightSeat;
import enums.ReservationStatus;

import java.util.Date;
import java.util.Map;

public class FlightReservation {

    String reservationNumber;
    FlightInstance flightInstance;
    Map<Passenger, FlightSeat> flightSeatMap;
    Date creationDate;
    ReservationStatus reservationStatus;


//    public static FlightReservation fetchReservationDetails(String reservationNumber);
//      public List<Passenger> getPassengers();


}
