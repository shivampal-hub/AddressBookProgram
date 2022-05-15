package com.bl.book;

import java.util.ArrayList;
import java.util.Scanner;


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

    public void addContactConsole() {

        System.out.println("Enter new Person Details-");

        PersonInfo person1 = new PersonInfo();
        Scanner sc = new Scanner(System.in);

        person1.firstName = sc.next();
        person1.lastName = sc.next();
        person1.address = sc.next();
        person1.city = sc.next();
        person1.state = sc.next();
        person1.zip = sc.next();
        person1.phoneNumber = sc.next();
        person1.email = sc.next();

        add(person1);

    }
}
