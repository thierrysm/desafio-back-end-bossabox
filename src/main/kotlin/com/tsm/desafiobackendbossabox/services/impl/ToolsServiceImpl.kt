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

    override fun findByTag(tag: String): List<ToolsDto> {
        val list: List<Tools> = toolsRepository.findByTag(tag)
        return list.map { x -> toolsMapper.fromEntity(x) };
    }

    override fun insert(toolsDto: ToolsDto): Tools {
        if (toolsRepository.existsById(toolsDto.id)) {
            throw RuntimeException("tools already exists")
        }
        return toolsRepository.save(toolsMapper.toEntity(toolsDto))
    }

    override fun deleteById(id: Long) {
        val tool = toolsRepository.findById(id).orElseThrow {
            RuntimeException("Tool not found with id: $id")
        }
        toolsRepository.delete(tool)
    }
}