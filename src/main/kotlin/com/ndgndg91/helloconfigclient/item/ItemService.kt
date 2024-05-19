package com.ndgndg91.helloconfigclient.item

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class ItemService(
    private val repository: ItemRepository
){

    @Cacheable(cacheNames = ["itemById"], key = "#id")
    fun findById(id: Long): Item {
        return repository.findById(id) ?: throw RuntimeException("Item not found")
    }
}