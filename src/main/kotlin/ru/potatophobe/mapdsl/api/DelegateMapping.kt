package ru.potatophobe.mapdsl.api

interface DelegateMapping<I, O> {
    val inputPath: String
    val outputPath: String

    fun map(input: I): O
}
