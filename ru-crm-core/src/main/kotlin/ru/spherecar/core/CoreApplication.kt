package ru.spherecar.core

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.runApplication

@SpringBootConfiguration
class CoreApplication

fun main(args: Array<String>) {

    runApplication<CoreApplication>(*args)
}