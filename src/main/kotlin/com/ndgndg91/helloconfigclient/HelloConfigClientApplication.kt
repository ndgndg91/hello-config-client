package com.ndgndg91.helloconfigclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class HelloConfigClientApplication

fun main(args: Array<String>) {
    runApplication<HelloConfigClientApplication>(*args)
}
