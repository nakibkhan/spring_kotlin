package blog.data

import blog.util.toSlug
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import java.time.LocalDateTime
import javax.persistence.GeneratedValue


@Entity
class Article(
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null
)