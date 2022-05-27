import java.util.List;

public class Flight {

    String flightNumber;
    Airport departure;
    Airport arrival;
    int durationInMinutes;
    List<Seat> seats;

    List<WeeklySchedule> weeklySchedules;
    List<CustomSchedule> customSchedules;
    List<FlightInstance> flightInstances;
}
