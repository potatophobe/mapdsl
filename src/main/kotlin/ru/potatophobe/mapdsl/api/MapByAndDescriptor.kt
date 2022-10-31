package ru.potatophobe.mapdsl.api

@Mapdsl
interface MapByAndDescriptor<I, O> {
    @Mapdsl
    infix fun and(propertyMapping: PropertyMapping<I & Any, O & Any>)
}
