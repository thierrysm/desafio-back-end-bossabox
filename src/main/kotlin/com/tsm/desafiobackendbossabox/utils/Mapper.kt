package com.tsm.desafiobackendbossabox.utils

interface Mapper<D, E> {

    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}