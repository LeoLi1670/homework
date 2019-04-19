package com.train;

import static java.lang.Math.round;

public class Ticket {

    private int oneWayPrice = 1000;
    private int roundTripPrice = 2000;
    private int oneWayTicketCount = 0;
    private int roundTripTicketCount = 0;

    public Ticket(int oneWayTicketCount, int roundTripTicketCount) {
        this.oneWayTicketCount = oneWayTicketCount;
        this.roundTripTicketCount = roundTripTicketCount;
    }

    public int getTotal() {
        int total = 0;
        total = oneWayPrice * (oneWayTicketCount - roundTripTicketCount) + round(roundTripPrice * roundTripTicketCount * 0.9f);
        return total;
    }

}
