package com.tsm.desafiobackendbossabox.domain.entities.dtos

data class ToolsDto (
    val id: Long,
    val title: String,
    var link: String,
    var description: String,
    var tags: List<String>
)