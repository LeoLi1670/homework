package com.train

import java.lang.Math.round
import java.util.*

fun main(args: Array<String>) {

    println("Please enter number of tickets :")
    val scanner = Scanner(System.`in`)
    val ticketCount: Int = scanner.nextInt()
    println("How many round-trip tickets :")
    val roundTripCount: Int = scanner.nextInt()
    val ticket = TicketKotlin(ticketCount, roundTripCount)
    println(
        "Total tickets:$ticketCount\nRound-trip:$roundTripCount\nTotal:${ticket.getTotal()}"
    )

}

class TicketKotlin(private val oneWayTicketCount: Int, private val roundTripTicketCount: Int) {

    private val oneWayPrice = 1000
    private val roundTripPrice = 2000

    fun getTotal(): Int {
        var total = 0
        total = oneWayPrice * (oneWayTicketCount - roundTripTicketCount) +
                round(roundTripPrice.toFloat() * roundTripTicketCount.toFloat() * 0.9f)
        return total
    }
}