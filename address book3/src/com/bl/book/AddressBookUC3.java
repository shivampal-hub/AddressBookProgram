package com.bl.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC3 {

    PersonRepository personRepository = new PersonRepository();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        AddressBookUC3 bookUC1 = new AddressBookUC3();
        UserInterface userInterface = new UserInterface();

        int option = 0;
        do {
            option =userInterface.showUserMenu();
            bookUC1.handleUserSelection(option);

        }while(option != 4 );
    }

    void modify(PersonInfo person) {

        System.out.println("Enter the details to update.\n 1.First Name\n 2.Last Name\n 3.Address\n 4.City\n 5.State\n 6.Zip\n 7.Phone Number\n 8.Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

            handleUpdateUserSelection(option, person);
    }

    void handleUpdateUserSelection(int option, PersonInfo person) {

        switch (option) {
            case 1:
                System.out.println("Enter new firstName");
                    Scanner sc = new Scanner(System.in);
                    String firstNameNew = sc.next();
                    person.firstName = firstNameNew;
                    break;

            case 2:
                System.out.println("Enter new LastName");
                Scanner sc1 = new Scanner(System.in);
                String lastNameNew = sc1.next();
                person.lastName = lastNameNew;
                break;

            case 3:
                System.out.println("Enter new address");
                Scanner sc2 = new Scanner(System.in);
                String addressNew = sc2.next();
                person.address = addressNew;
                break;

            case 4:
                System.out.println("Enter new City");
                Scanner sc3 = new Scanner(System.in);
                String cityNew = sc3.next();
                person.city = cityNew;
                break;

            case 5:
                System.out.println("Enter new State");
                Scanner sc4 = new Scanner(System.in);
                String stateNew = sc4.next();
                person.state = stateNew;
                break;

            case 6:
                System.out.println("Enter new Zip");
                Scanner sc5 = new Scanner(System.in);
                String zipNew = sc5.next();
                person.zip = zipNew;
                break;

            case 7:
                System.out.println("Enter new Phone Number");
                Scanner sc6 = new Scanner(System.in);
                String phoneNumberNew = sc6.next();
                person.phoneNumber = phoneNumberNew;
                break;
            case 8:
                System.out.println("Enter new Email");
                Scanner sc7 = new Scanner(System.in);
                String emailNew = sc7.next();
                person.email = emailNew;
                break;

        }
    }

    void handleUserSelection(int option) {

        switch (option) {

            case 1:
                addContactConsole();
                break;

            case 2:
                System.out.println("Enter Person Name which you want to update");
                Scanner sc1 = new Scanner(System.in);
                String name1 = sc1.next();
                PersonInfo person1 = personRepository.getPerson(name1);
                modify(person1);
                break;

            case 3:
                UserInterface userInterface = new UserInterface();
                ArrayList list =personRepository.getList();
                userInterface.print(list);
                break;

            case 4:
                break;

            default:
                System.out.println("Choose Correct option");
        }
    }

    public void addContactConsole() {

        System.out.println("Enter new Person Details-");

        PersonInfo personInfo = new PersonInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        personInfo.firstName = sc.next();
        System.out.println("Enter Last Name");
        personInfo.lastName = sc.next();
        System.out.println("Enter Address");
        personInfo.address = sc.next();
        System.out.println("Enter City");
        personInfo.city = sc.next();
        System.out.println("Enter State");
        personInfo.state = sc.next();
        System.out.println("Enter Zip");
        personInfo.zip = sc.next();
        System.out.println("Enter Phone Number");
        personInfo.phoneNumber = sc.next();
        System.out.println("Enter Email");
        personInfo.email = sc.next();

        personRepository.add(personInfo);

    }
}
