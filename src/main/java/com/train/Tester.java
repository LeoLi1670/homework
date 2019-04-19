package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int ticketCount = 0;

        while (ticketCount != -1) {
            System.out.println("Please enter number of tickets :");
            Scanner scanner = new Scanner(System.in);
            ticketCount = scanner.nextInt();
            if (ticketCount == -1) break;
            System.out.println("How many round-trip tickets :");
            int roundTripCount = scanner.nextInt();
            Ticket ticket = new Ticket(ticketCount, roundTripCount);
            System.out.println("Total tickets: " + ticketCount + "\n" +
                    "Round-trip:" + roundTripCount + "\n" +
                    "Total:" + ticket.getTotal());
        }
    }

}
