package blog.data

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User (
        @Id @GeneratedValue var id: Long? = null,
        var login: String,
        var firstName: String,
        var lastName: String,
        @JsonFormat(shape = JsonFormat.Shape.STRING,  pattern = "MM/dd/yyyy") var dateOfBrth: LocalDate,
        var emailAddress: String
) {
    constructor() : this(null, "",
            "", "", LocalDate.now(),""
    )
}