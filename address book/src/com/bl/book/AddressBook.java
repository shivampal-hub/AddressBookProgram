package com.bl.book;

import java.util.ArrayList;


public class AddressBook {

    ArrayList<PersonInfo> list = new ArrayList<>();

    public ArrayList getList() {
        return list;
    }

    void add(PersonInfo person) {
        list.add(person);

    }

    public void addContact() {

        System.out.println("Person Details-");

        PersonInfo person = new PersonInfo();
        person.firstName = "Shivam";
        person.lastName = "Pal";
        person.address = "1/683";
        person.city = "Vasundhara";
        person.state = "UP";
        person.zip = "201012";
        person.phoneNumber = "9999295772";
        person.email = "shivamm.ppal@gmail.com";

        add(person);

    }

}
