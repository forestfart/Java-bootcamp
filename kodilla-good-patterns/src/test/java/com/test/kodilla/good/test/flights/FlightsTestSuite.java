package flights;

import org.junit.Test;

import java.util.ArrayList;

public class FlightsTestSuite {
    @Test
    public void testFlightRetriever() {
        FlightsRepoRetriever flightsRepoRetriever = new FlightsRepoRetriever();
        ArrayList<Flight> flightsList = flightsRepoRetriever.retrieve();

        flightsList.stream()
                .map(n -> n.getDepartureTime() + " " + n.getFlightNumber() + " " + n.getDepartureAirport() + " " + n.getArrivalAirport() + " " + n.getArrivalTime())
                .forEach(System.out::println);
    }
}
