package com.tsm.desafiobackendbossabox.services.impl

import com.tsm.desafiobackendbossabox.domain.repositories.ToolsRepository
import com.tsm.desafiobackendbossabox.services.ToolsService
import org.springframework.stereotype.Service

@Service
class ToolsServiceImpl(
    private val toolsRepository: ToolsRepository
    ) : ToolsService