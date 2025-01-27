// ReviewRepository.kt
package com.loka.server.repository

import com.loka.server.entity.Review
import com.loka.server.entity.Experience
import com.loka.server.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ReviewRepository : JpaRepository<Review, Long> {
    fun findByUserAndExperience(user: User, experience: Experience): Optional<Review>
    fun findByExperience(experience: Experience): List<Review>
    fun findByUser(user: User): List<Review>
}
