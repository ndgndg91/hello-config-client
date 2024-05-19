package com.ndgndg91.helloconfigclient.item

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(
    private val itemService: ItemService
) {
    @GetMapping("/apis/items/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Item> {
        val item = itemService.findById(id)
        return ResponseEntity.ok(item)
    }
}