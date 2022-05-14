package com.bl.book;

public class AddressBookUC1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook book = new AddressBook();

        book.addContact();
        PersonInfo p = new PersonInfo();
        p.print(book.getList());

    }

}
