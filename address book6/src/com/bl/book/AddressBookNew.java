package com.bl.book;

import java.util.ArrayList;

public class AddressBookNew implements NewBook{

    public void printNew(ArrayList list1) {

        for(Object obj: list1){
            System.out.println(obj);
        }
    }
}
