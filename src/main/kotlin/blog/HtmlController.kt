package blog

import blog.data.Greeting
import blog.data.User
import blog.repositoy.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class HtmlController {

    val counter = AtomicLong()

    @Autowired
    lateinit var userRepository : UserRepository

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }


    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @PostMapping("/users")
    fun addUser(@RequestBody user: User) =
        userRepository.save(user)

    @GetMapping("/users")
    fun getAll() : Iterable<User>   {
        return userRepository.findAll()
    }





}