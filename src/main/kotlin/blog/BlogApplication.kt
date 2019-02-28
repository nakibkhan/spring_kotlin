package blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
