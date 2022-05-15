package com.bl.book;

public class AddressBookUC1  extends AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook book = new AddressBook();
        book.addContact();
        book.addContactConsole();

        PersonInfo personInfo = new PersonInfo();
        personInfo.print(book.getList());

    }
}
