package blog.repositoy

import blog.data.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>   {
    fun findByFirstName(firstName: String): User?
    fun findByLastName(lastName: String): User?
    fun findByLogin(login: String): User?
}