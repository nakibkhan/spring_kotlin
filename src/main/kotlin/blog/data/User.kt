package blog.data

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.Entity

@Entity class User (
        var login: String,
        var firstName: String,
        var lastName: String,
        @JsonFormat(shape = JsonFormat.Shape.STRING,  pattern = "MM/dd/yyyy") var dateOfBrth: LocalDate,
        var emailAddress: String
    )