package flights;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchProcessor {

    public List<Flight> departureAirportSearch (ArrayList<Flight> currentFlightsList, String selectedAirport) {

        return currentFlightsList.stream()
                .filter(n -> n.getDepartureAirport().equals(selectedAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalAirportSearch (ArrayList<Flight> currentFlightList, String selectedAirport) {

        return currentFlightList.stream()
                .filter(n -> n.getArrivalAirport().equals(selectedAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getDeparturesAfterLocalTime (ArrayList<Flight> currentFlightList, String selectedAirport, LocalTime arrivalTime) {

        return departureAirportSearch(currentFlightList, selectedAirport).stream()
                .filter(n -> n.getDepartureTime().isAfter(arrivalTime))
                .collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch (ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {

        List<Flight> flightsFromDestination = departureAirportSearch(currentFlightList, departureAirport);

        return flightsFromDestination.stream()
                .filter(n -> n.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public HashMap<Flight, Flight> connectionFlightSearch (ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {

        List<Flight> flightsFromDestination = departureAirportSearch(currentFlightList, departureAirport);

        HashMap<Flight, Flight> connectedFlights = new HashMap<>();
        List<Flight> connectionOption;

        for (int i1 = 0; i1 < flightsFromDestination.size(); i1++) {

            connectionOption = getDeparturesAfterLocalTime(currentFlightList, flightsFromDestination.get(i1).getArrivalAirport(), flightsFromDestination.get(i1).getArrivalTime());

            for (int i2 = 0; i2 < connectionOption.size(); i2++) {
                if ((connectionOption.get(i2).getArrivalAirport()).equals(arrivalAirport)) {
                    connectedFlights.put(flightsFromDestination.get(i1), connectionOption.get(i2));
                }
            }
        }
        return connectedFlights;
    }
}

