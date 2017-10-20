package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"John Kiczorek", (char)'M',LocalDate.of(2009, 12, 31), 5));
        userList.add(new ForumUser(2,"Allen Murphy",(char)'M',LocalDate.of(2005, 10, 1), 2));
        userList.add(new ForumUser(3,"Jan Kowalski", (char)'M',LocalDate.of(1989, 02, 3), 25));
        userList.add(new ForumUser(4,"Allen Masakra",(char)'M',LocalDate.of(1955, 10, 1), 1));
        userList.add(new ForumUser(5,"John Kiczorek", (char)'M',LocalDate.of(2009, 12, 31), 5));
        userList.add(new ForumUser(6,"Ally Moskitiera",(char)'F',LocalDate.of(2005, 10, 1), 2));
        userList.add(new ForumUser(7,"Monika Nowak", (char)'F',LocalDate.of(1987, 02, 3), 255));
        userList.add(new ForumUser(8,"Magdalena Masakra",(char)'F',LocalDate.of(1965, 10, 1), 0));
        userList.add(new ForumUser(9,"John Kiczorek", (char)'M',LocalDate.of(2009, 12, 31), 5));
        userList.add(new ForumUser(10,"Marek Wiczorek", (char)'M',LocalDate.of(2007, 10, 19), 5));
        userList.add(new ForumUser(11,"Janek Poranek", (char)'M',LocalDate.of(2007, 10, 20), 5));
        userList.add(new ForumUser(11,"Janek Poranek", (char)'M',LocalDate.of(2007, 10, 21), 5));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}
