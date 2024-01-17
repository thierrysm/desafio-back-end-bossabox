package com.tsm.desafiobackendbossabox.controllers

import com.tsm.desafiobackendbossabox.services.ToolsService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tools")
class ToolsController(private val toolsService: ToolsService)