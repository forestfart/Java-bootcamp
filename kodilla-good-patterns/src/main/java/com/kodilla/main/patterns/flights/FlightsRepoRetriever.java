package flights;

import java.time.LocalTime;
import java.util.ArrayList;

public class FlightsRepoRetriever {

    public ArrayList<Flight> retrieve() {

        ArrayList<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("EZS1114", "KRK", LocalTime.of(11,15), "GVA",  LocalTime.of(13,0)));
        flightList.add(new Flight("LO3910", "KRK", LocalTime.of(5,50), "WAW",  LocalTime.of(6,30)));
        flightList.add(new Flight("LO3904", "KRK", LocalTime.of(9,0), "WAW",  LocalTime.of(9,30)));
        flightList.add(new Flight("LO3920", "KRK", LocalTime.of(10,35), "WAW",  LocalTime.of(11,10)));
        flightList.add(new Flight("LO3908", "KRK", LocalTime.of(12,10), "WAW",  LocalTime.of(12,40)));
        flightList.add(new Flight("LO3906", "KRK", LocalTime.of(15,5), "WAW",  LocalTime.of(15,40)));
        flightList.add(new Flight("LO3924", "KRK", LocalTime.of(18,5), "WAW",  LocalTime.of(18,40)));
        flightList.add(new Flight("LO3922", "KRK", LocalTime.of(21,5), "WAW",  LocalTime.of(21,40)));
        flightList.add(new Flight("LO3504", "KRK", LocalTime.of(6,50), "GDN",  LocalTime.of(7,40)));
        flightList.add(new Flight("LO3502", "KRK", LocalTime.of(18,30), "GDN",  LocalTime.of(19,20)));
        flightList.add(new Flight("FR7151", "KRK", LocalTime.of(19,35), "GDN",  LocalTime.of(20,25)));
        flightList.add(new Flight("D83561", "KRK", LocalTime.of(12,5), "CPH",  LocalTime.of(13,10)));
        flightList.add(new Flight("LH1365", "KRK", LocalTime.of(10,50), "FRA",  LocalTime.of(12,30)));

        flightList.add(new Flight("LO3828", "GDN", LocalTime.of(5,35), "WAW",  LocalTime.of(6,35)));
        flightList.add(new Flight("SAS1758", "GDN", LocalTime.of(6,0), "CPH",  LocalTime.of(7,5))); //2
        flightList.add(new Flight("LO3832", "GDN", LocalTime.of(8,50), "WAW",  LocalTime.of(9,45)));
        flightList.add(new Flight("LO3836", "GDN", LocalTime.of(12,10), "WAW",  LocalTime.of(13,5)));
        flightList.add(new Flight("LO3816", "GDN", LocalTime.of(18,10), "WAW",  LocalTime.of(19,10)));
        flightList.add(new Flight("LO3826", "GDN", LocalTime.of(21,5), "WAW",  LocalTime.of(22,0)));
        flightList.add(new Flight("LO3501", "GDN", LocalTime.of(20,20), "KRK",  LocalTime.of(21,40)));

        flightList.add(new Flight("LO3907", "WAW", LocalTime.of(10,45), "KRK",  LocalTime.of(11,40)));
        flightList.add(new Flight("LO3905", "WAW", LocalTime.of(13,30), "KRK",  LocalTime.of(14,25)));
        flightList.add(new Flight("LO3903", "WAW", LocalTime.of(7,30), "KRK",  LocalTime.of(8,25)));
        flightList.add(new Flight("LO3923", "WAW", LocalTime.of(16,40), "KRK",  LocalTime.of(17,35)));
        flightList.add(new Flight("LO3921", "WAW", LocalTime.of(19,40), "KRK",  LocalTime.of(20,35)));
        flightList.add(new Flight("LO3911", "WAW", LocalTime.of(22,45), "KRK",  LocalTime.of(23,40)));
        flightList.add(new Flight("LO3919", "WAW", LocalTime.of(15,20), "KRK",  LocalTime.of(16,15)));
        flightList.add(new Flight("LO3827", "WAW", LocalTime.of(22,40), "GDN",  LocalTime.of(23,35)));
        flightList.add(new Flight("LO3815", "WAW", LocalTime.of(16,40), "GDN",  LocalTime.of(17,35)));
        flightList.add(new Flight("LO3837", "WAW", LocalTime.of(13,35), "GDN",  LocalTime.of(14,30)));
        flightList.add(new Flight("LO3825", "WAW", LocalTime.of(19,40), "GDN",  LocalTime.of(20,35)));
        flightList.add(new Flight("LO3835", "WAW", LocalTime.of(10,45), "GDN",  LocalTime.of(11,40)));
        flightList.add(new Flight("LO3831", "WAW", LocalTime.of(7,25), "GDN",  LocalTime.of(8,20)));
        flightList.add(new Flight("AF1247", "WAW", LocalTime.of(6,35), "CDG",  LocalTime.of(9,10)));

        flightList.add(new Flight("AF1640", "CDG", LocalTime.of(11,50), "AMS",  LocalTime.of(13,5)));

        flightList.add(new Flight("AF8255", "AMS", LocalTime.of(13,50), "KRK",  LocalTime.of(15,45)));

        flightList.add(new Flight("LO464", "CPH", LocalTime.of(11,25), "WAW",  LocalTime.of(12,45)));

        flightList.add(new Flight("LH1378", "FRA", LocalTime.of(22,00), "GDN",  LocalTime.of(23,35)));

        return flightList;
    }
}
