package com.bl.book;

public class PersonInfo {

    String firstName, lastName, address, city, state, zip, phoneNumber, email;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city=" + city + '\'' + ", state=" + state + '\'' + ", zip=" + zip + '\'' + ", phoneNumber=" + phoneNumber + '\'' + ", email=" + email + '}';
    }
}
