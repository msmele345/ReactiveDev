package com.mitchmele.ReactiveDev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveDevApplication

fun main(args: Array<String>) {
	runApplication<ReactiveDevApplication>(*args)
}
