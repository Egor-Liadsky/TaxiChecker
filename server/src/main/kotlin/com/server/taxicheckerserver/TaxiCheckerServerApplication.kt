package com.server.taxicheckerserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaxiCheckerServerApplication

fun main(args: Array<String>) {
    runApplication<TaxiCheckerServerApplication>(*args)
}
