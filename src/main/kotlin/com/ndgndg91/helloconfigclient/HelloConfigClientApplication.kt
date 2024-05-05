package com.ndgndg91.helloconfigclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloConfigClientApplication

fun main(args: Array<String>) {
    runApplication<HelloConfigClientApplication>(*args)
}
