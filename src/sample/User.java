package sample;

import java.util.Scanner;

public class User {
    String name;

    public void getName(){
        System.out.print("Enter your name: ");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
    }
}
