package com.tsm.desafiobackendbossabox.controllers

import com.tsm.desafiobackendbossabox.domain.entities.dtos.ToolsDto
import com.tsm.desafiobackendbossabox.services.ToolsService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tools")
class ToolsController(private val toolsService: ToolsService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<ToolsDto>> {
        val list = toolsService.findAll()
        return ResponseEntity.ok(list)
    }

    @GetMapping("/findByTag")
    fun findByTag(@RequestParam tag: String?): ResponseEntity<List<ToolsDto>> {
        val tools = toolsService.findByTag(tag ?:"")
        return ResponseEntity.ok(tools)
    }
}