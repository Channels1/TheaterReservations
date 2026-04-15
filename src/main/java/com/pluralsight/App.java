package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner uKey = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = uKey.nextLine().trim();

        System.out.println("What date you'll be coming?(MM/dd/yyyy)");
        String date = uKey.nextLine().trim();

        System.out.println("How many tickets would you like?");
        int ticket = uKey.nextInt();

        String[] nameSplit = name.split(" ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.parse(date,formatter);
        int tickets = ticket;
        String tickCount = (ticket >= 1) ? "ticket" : "tickets";

        System.out.printf(tickets+" "+tickCount+" "+"Reserved for "+date1+" "+
                "Under %s,%s",nameSplit[1],nameSplit[0]);



    }
}
