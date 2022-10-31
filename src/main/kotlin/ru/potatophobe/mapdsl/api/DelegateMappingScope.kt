package ru.potatophobe.mapdsl.api

@Mapdsl
interface DelegateMappingScope<I> {
    @Mapdsl
    val path: String

    @Mapdsl
    val input: I
}
