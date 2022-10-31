package ru.potatophobe.mapdsl.api

@Mapdsl
interface DelegateMappingScope<I> {
    @Mapdsl
    val input: I

    @Mapdsl
    val inputPath: String

    @Mapdsl
    val outputPath: String
}
