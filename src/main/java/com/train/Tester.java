package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int ticketCount = -1;
        int roundTripCount = -1;

        System.out.println("Please enter number of tickets :");
        Scanner scanner = new Scanner(System.in);
        ticketCount = scanner.nextInt();
        System.out.println("How many round-trip tickets :");
        roundTripCount = scanner.nextInt();
        Ticket ticket = new Ticket(ticketCount, roundTripCount);
        System.out.println("Total tickets: " + ticketCount + "\n" +
                "Round-trip:" + roundTripCount + "\n" +
                "Total:" + ticket.getTotal());
    }

}
