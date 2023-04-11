package dev.knowledgecafe.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["dev.knowledgecafe"])
class RestKotlinApplication

fun main(args: Array<String>) {
	runApplication<RestKotlinApplication>(*args)
}
