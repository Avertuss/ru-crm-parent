package ru.sferacar.client

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@SpringBootConfiguration
open class ClientApplication


fun main(args: Array<String>) {

    runApplication<ClientApplication>(*args)
}