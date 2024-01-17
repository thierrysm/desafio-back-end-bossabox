package com.tsm.desafiobackendbossabox.utils

import com.tsm.desafiobackendbossabox.domain.entities.Tools
import com.tsm.desafiobackendbossabox.domain.entities.dtos.ToolsDto
import org.springframework.stereotype.Component

@Component
class ToolsMapper : Mapper<ToolsDto, Tools> {

    override fun fromEntity(entity: Tools): ToolsDto = ToolsDto(
        entity.id,
        entity.title,
        entity.link,
        entity.description,
        entity.tags
    )

    override fun toEntity(domain: ToolsDto): Tools = Tools(
        domain.id,
        domain.title,
        domain.link,
        domain.description,
        domain.tags
    )
}