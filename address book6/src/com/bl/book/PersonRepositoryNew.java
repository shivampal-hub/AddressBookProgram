package com.bl.book;

import java.util.ArrayList;

public class PersonRepositoryNew {

    private ArrayList list1 = new ArrayList();


    public ArrayList getList1() {

        return list1;
    }


    void add(PersonInfoNew personNew) {

        list1.add(personNew);
    }

    PersonInfoNew getPersonNew(String firstName) {
        for(Object personNew: list1) {
            PersonInfoNew personObj = (PersonInfoNew) personNew;
            if(firstName.equalsIgnoreCase(personObj.firstName)) {
                return personObj;
            }
        }return null;
    }
}
