package com.internshala;
import java.util.Scanner;

public class practice_05 {
    public static void main(String[] args) {
        String name;

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hey " + name + ", it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
    }
}
