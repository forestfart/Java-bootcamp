package flights;

import java.time.LocalTime;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private LocalTime departureTime;
    private String arrivalAirport;
    private LocalTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, LocalTime departureTime, String arrivalAirport, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }
}
