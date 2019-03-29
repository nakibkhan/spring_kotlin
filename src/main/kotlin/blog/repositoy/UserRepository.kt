package blog.repositoy

import blog.data.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

interface UserRepository : CrudRepository<User, Long>   {
    fun findByFirstName(firstName: String): Iterable<User>
    fun findByLastName(lastName: String): Iterable<User>
    fun findByLogin(login: String): User?
}