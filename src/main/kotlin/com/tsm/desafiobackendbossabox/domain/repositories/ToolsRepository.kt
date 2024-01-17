package com.tsm.desafiobackendbossabox.domain.repositories

import com.tsm.desafiobackendbossabox.domain.entities.Tools
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ToolsRepository : JpaRepository<Tools, Long> {

    @Query(value = "SELECT * FROM tools WHERE :tag = ANY(tags);", nativeQuery = true)
    fun findByTag(tag: String): List<Tools>
}