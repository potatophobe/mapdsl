package ru.potatophobe.mapdsl.api

import kotlin.reflect.KClass

class UndefinedMappingException(
    val inputType: KClass<*>,
    val outputType: KClass<*>,
    override val message: String = "Mapping from $inputType to $outputType is undefined",
    override val cause: Throwable? = null
) : Exception()
