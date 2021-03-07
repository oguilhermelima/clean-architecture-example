package br.com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication(scanBasePackages = ["br.com.example"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
