package com.tsm.desafiobackendbossabox.domain.repositories

import com.tsm.desafiobackendbossabox.domain.entities.Tools
import org.springframework.data.jpa.repository.JpaRepository

interface ToolsRepository : JpaRepository<Tools, Long>