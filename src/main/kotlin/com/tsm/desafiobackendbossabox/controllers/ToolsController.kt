package com.tsm.desafiobackendbossabox.controllers

import com.tsm.desafiobackendbossabox.domain.entities.Tools
import com.tsm.desafiobackendbossabox.domain.entities.dtos.ToolsDto
import com.tsm.desafiobackendbossabox.services.ToolsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

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

    @PostMapping
    fun insert(@RequestBody toolsDto: ToolsDto): ResponseEntity<Tools> {
        val obj = toolsService.insert(toolsDto)
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }
}