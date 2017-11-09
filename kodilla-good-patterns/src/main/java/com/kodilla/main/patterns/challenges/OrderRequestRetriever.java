package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("westfall",
                "John",
                "Clemson",
                LocalDate.of(1985,5,3), //DOB
                "37 West st",
                "Ghosttown",
                "31-558",
                "GhostCountry",
                621500400);
        return new OrderRequest(user, "Kapcie Full Wypas", "Kapcie", LocalDate.now(), 544411125);
    }
}
