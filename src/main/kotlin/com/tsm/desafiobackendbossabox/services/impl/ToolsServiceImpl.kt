package com.tsm.desafiobackendbossabox.services.impl

import com.tsm.desafiobackendbossabox.domain.entities.Tools
import com.tsm.desafiobackendbossabox.domain.entities.dtos.ToolsDto
import com.tsm.desafiobackendbossabox.domain.repositories.ToolsRepository
import com.tsm.desafiobackendbossabox.services.ToolsService
import com.tsm.desafiobackendbossabox.utils.ToolsMapper
import org.springframework.stereotype.Service

@Service
class ToolsServiceImpl(
    private val toolsRepository: ToolsRepository,
    private val toolsMapper: ToolsMapper) : ToolsService {

    override fun findAll(): List<ToolsDto> {
        val list: List<Tools> = toolsRepository.findAll()
        return list.map { x -> toolsMapper.fromEntity(x) };
    }
}