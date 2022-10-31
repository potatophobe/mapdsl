package ru.potatophobe.mapdsl.api

import kotlin.reflect.KClass

@Mapdsl
interface TypeMappingScope {
    @Mapdsl
    fun <I : Any> from(inputType: KClass<I>): FromDescriptor<I>

    @Mapdsl
    fun <O : Any> to(outputType: KClass<O>): ToDescriptor<O>

    @Mapdsl
    fun <I : Any, O : Any> delegate(delegateBlock: DelegateMappingScope<I>.() -> O): DelegateMapping<I, O>

    @Mapdsl
    fun <I : Any, O : Any> mapping(mappingBlock: PropertyMappingScope<I, O>.() -> Unit): PropertyMapping<I, O>

    @Mapdsl
    infix fun <I : Any, O : Any> FromDescriptor<I>.map(to: ToDescriptor<O>): MapByDescriptor<I, O>

    @Mapdsl
    interface FromDescriptor<I : Any>

    @Mapdsl
    interface ToDescriptor<O : Any>
}
