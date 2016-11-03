package ee.kotlin.rest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Martin Härm on 03.11.2016.
 */
@SpringBootApplication
open class App {
}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}