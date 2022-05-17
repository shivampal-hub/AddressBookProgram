package com.bl.book;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    int showUserMenu() {
        System.out.println("Enter 1.Add Contact\n 2.Modify\n 3.Print\n 4.Delete\n 5.Exit ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        return option;
    }

    void print(ArrayList list) {

        for(Object obj: list){
            System.out.println(obj);
        }
    }
}
