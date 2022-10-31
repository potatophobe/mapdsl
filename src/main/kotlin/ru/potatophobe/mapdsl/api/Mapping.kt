package ru.potatophobe.mapdsl.api

import kotlin.reflect.KClass

interface Mapping {
    @Throws(UndefinedMappingException::class)
    fun <I : Any, O : Any> map(from: I, to: KClass<O>): O
}

inline fun <I : Any, reified O : Any> Mapping.map(from: I): O {
    return map(from = from, to = O::class)
}
