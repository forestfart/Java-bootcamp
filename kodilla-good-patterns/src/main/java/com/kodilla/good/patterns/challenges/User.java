package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public final class User {

    private final String user;
    private final String userName;
    private final String userSurname;
    private final LocalDate dOB;
    private String streetAddress;
    private String cityAddress;
    private String postalCode;
    private String country;
    private int phoneNumber;
    public LocalDate lastSeen;

    public User(String user, String userName, String userSurname, LocalDate dOB, String streetAddress, String cityAddress, String postalCoode, String country, int phoneNumber) {
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
        this.dOB = dOB;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.postalCode = postalCoode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public User(String user, String userName, String userSurname, LocalDate dOB) {
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
        this.dOB = dOB;
    }

    public String getUser() {
        return user;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public LocalDate getdOB() {
        return dOB;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getLastSeen() {
        return lastSeen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user1 = (User) o;

        if (!user.equals(user1.user)) return false;
        if (userName != null ? !userName.equals(user1.userName) : user1.userName != null) return false;
        return userSurname != null ? userSurname.equals(user1.userSurname) : user1.userSurname == null;
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userSurname != null ? userSurname.hashCode() : 0);
        return result;
    }
}
