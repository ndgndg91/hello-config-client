package com.ndgndg91.helloconfigclient.item

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigInteger
import java.util.UUID

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item(
    val id: BigInteger,
    val name: String,
    val sku: UUID,
    val tags: List<String>,
    val createdAt: Long
)