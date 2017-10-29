package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Set;

public final class FindFlightMockUp {

    public static boolean checkIfExistsOnMap (Set<String> airportSet, String comparedAirport) {
        boolean isOnMap = airportSet.stream()
                .anyMatch(n -> n.equals(comparedAirport));
        System.out.println(comparedAirport + " <<---- exists on map: " + isOnMap);
        return isOnMap;
    }


    public final void findFlight(Flight flight) throws RouteNotFoundException {

        // create mock-up airports map
        final HashMap<String, Boolean> availability = new HashMap<>();
        availability.put("LHR", true);
        availability.put("WAW", true);
        availability.put("KRK", false);
        availability.put("JFK", true);
        availability.put("LAX", true);
        availability.put("SYD", true);

        // throw an exception if airport does not exist

        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) == true && checkIfExistsOnMap(availability.keySet(), flight.departureAirport) == true) {
            System.out.println("System continues to work..");
        } else {
            throw new RouteNotFoundException("no such airport on map");
        }
    }
}

