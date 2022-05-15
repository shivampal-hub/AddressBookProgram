package com.bl.book;

import java.util.ArrayList;


public class PersonInfo {

    String firstName, lastName, address, city, state, zip, phoneNumber, email;

    void print(ArrayList list) {
        list.stream().forEach(System.out::println);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city=" + city + '\'' + ", state=" + state + '\'' + ", zip=" + zip + '\'' + ", phoneNumber=" + phoneNumber + '\'' + ", email=" + email + '}';
    }
}
