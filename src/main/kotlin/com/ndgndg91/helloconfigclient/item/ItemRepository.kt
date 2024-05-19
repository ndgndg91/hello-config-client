package com.ndgndg91.helloconfigclient.item

import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Repository
import java.math.BigInteger
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

@Repository
class ItemRepository {
    private val logger = LoggerFactory.getLogger(ItemRepository::class.java)
    private val items = ConcurrentHashMap<Long, Item>()

    @PostConstruct
    private fun setup() {
        items[1] = Item(BigInteger.ONE, "바나나우유", UUID.randomUUID(), listOf("식품"), System.currentTimeMillis() / 1000)
        items[2] = Item(BigInteger.TWO, "초코우유", UUID.randomUUID(), listOf("식품"), System.currentTimeMillis() / 1000)
    }

    fun findById(id: Long): Item? {
        logger.info("called findById $id")
        return items[id]
    }
}