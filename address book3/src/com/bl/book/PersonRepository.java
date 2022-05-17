package com.bl.book;

import java.util.ArrayList;

public class PersonRepository {

    private ArrayList list = new ArrayList();

    public ArrayList getList() {

        return list;
    }

    void add(PersonInfo person) {

        list.add(person);
    }

    PersonInfo getPerson(String firstName) {
        for(Object person: list) {
            PersonInfo personObj = (PersonInfo) person;
            if(firstName.equalsIgnoreCase(personObj.firstName)) {
                return personObj;
            }
        }return null;
    }
}
