package com.tsm.desafiobackendbossabox.services

import com.tsm.desafiobackendbossabox.domain.entities.dtos.ToolsDto

interface ToolsService {

    fun findAll(): List<ToolsDto>

    fun findByTag(tag: String): List<ToolsDto>

}