package ru.potatophobe.mapdsl.api

@Mapdsl
interface MapByDescriptor<I, O> {
    @Mapdsl
    infix fun by(defaultMapping: DefaultMapping): MapByAndDescriptor<I, O>

    @Mapdsl
    infix fun by(delegateMapping: DelegateMapping<I, O>)

    @Mapdsl
    infix fun by(propertyMapping: PropertyMapping<I & Any, O & Any>)
}
