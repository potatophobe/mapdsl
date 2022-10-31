package ru.potatophobe.mapdsl.api

import kotlin.reflect.KProperty1

@Mapdsl
interface PropertyMappingScope<I : Any, O : Any> {
    @Mapdsl
    fun <IP> from(inputProperty: KProperty1<I, IP>): FromDescriptor<IP>

    @Mapdsl
    @JvmName("to_OP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <OP : Any> to(outputProperty: KProperty1<O, OP?>): ToDescriptor<OP?>

    @Mapdsl
    @JvmName("to_nOP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <OP : Any> to(outputProperty: KProperty1<O, OP>): ToDescriptor<OP>

    @Mapdsl
    @JvmName("into_nOP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <OP : Any> into(outputProperty: KProperty1<O, OP?>): IntoDescriptor<OP?>

    @Mapdsl
    @JvmName("into_OP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <OP : Any> into(outputProperty: KProperty1<O, OP>): IntoDescriptor<OP>

    @Mapdsl
    fun <I, O> delegate(delegateBlock: DelegateMappingScope<I>.() -> O): DelegateMapping<I, O>

    @Mapdsl
    fun <I : Any, O : Any> mapping(mappingBlock: PropertyMappingScope<I, O>.() -> Unit): PropertyMapping<I, O>

    @Mapdsl
    @JvmName("from_nI_IP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <I : Any, IP : Any> FromDescriptor<I?>.from(inputProperty: KProperty1<I, IP>): FromDescriptor<IP?>

    @Mapdsl
    @JvmName("from_nI_nIP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <I : Any, IP : Any> FromDescriptor<I?>.from(inputProperty: KProperty1<I, IP?>): FromDescriptor<IP?>

    @Mapdsl
    @JvmName("from_I_nIP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <I : Any, IP : Any> FromDescriptor<I>.from(inputProperty: KProperty1<I, IP?>): FromDescriptor<IP?>

    @Mapdsl
    @JvmName("from_I_IP")
    @Suppress("INAPPLICABLE_JVM_NAME")
    fun <I : Any, IP : Any> FromDescriptor<I>.from(inputProperty: KProperty1<I, IP>): FromDescriptor<IP>

    @Mapdsl
    fun <I : Any> FromDescriptor<I?>.or(value: I): FromDescriptor<I>

    @Deprecated(
        level = DeprecationLevel.ERROR,
        message = "Nullable property must have default value to map to non nullable property",
        replaceWith = ReplaceWith(".or(someValue) map")
    )
    @JvmName("map_nI_O")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any, O : Any> FromDescriptor<I?>.map(to: ToDescriptor<O>): Nothing

    @Mapdsl
    @JvmName("map_nI_nO")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any, O : Any> FromDescriptor<I?>.map(to: ToDescriptor<O?>): MapByDescriptor<I?, O?>

    @Mapdsl
    @JvmName("map_I_nO")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any, O : Any> FromDescriptor<I>.map(to: ToDescriptor<O?>): MapByDescriptor<I, O?>

    @Mapdsl
    @JvmName("map_I_O")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any, O : Any> FromDescriptor<I>.map(to: ToDescriptor<O>): MapByDescriptor<I, O>

    @Deprecated(
        level = DeprecationLevel.ERROR,
        message = "Nullable property must have default value to put into non nullable property",
        replaceWith = ReplaceWith(".or(someValue) put")
    )
    @JvmName("put_nI_I")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any> FromDescriptor<I?>.put(into: IntoDescriptor<I>): Nothing

    @Mapdsl
    @JvmName("put_nI_nI")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any> FromDescriptor<I?>.put(into: IntoDescriptor<I?>)

    @Mapdsl
    @JvmName("put_I_nI")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any> FromDescriptor<I>.put(into: IntoDescriptor<I?>)

    @Mapdsl
    @JvmName("put_I_I")
    @Suppress("INAPPLICABLE_JVM_NAME")
    infix fun <I : Any> FromDescriptor<I>.put(into: IntoDescriptor<I>)

    @Mapdsl
    interface FromDescriptor<I>

    @Mapdsl
    interface ToDescriptor<O> {
        @Mapdsl
        @JvmName("to_nOP")
        @Suppress("INAPPLICABLE_JVM_NAME")
        fun <OP : Any> to(outputProperty: KProperty1<O & Any, OP?>): ToDescriptor<OP?>

        @Mapdsl
        @JvmName("to_OP")
        @Suppress("INAPPLICABLE_JVM_NAME")
        fun <OP : Any> to(outputProperty: KProperty1<O & Any, OP>): ToDescriptor<OP>
    }

    @Mapdsl
    interface IntoDescriptor<O> {
        @Mapdsl
        @JvmName("into_nOP")
        @Suppress("INAPPLICABLE_JVM_NAME")
        fun <OP : Any> into(outputProperty: KProperty1<O & Any, OP?>): IntoDescriptor<OP?>

        @Mapdsl
        @JvmName("into_OP")
        @Suppress("INAPPLICABLE_JVM_NAME")
        fun <OP : Any> into(outputProperty: KProperty1<O & Any, OP>): IntoDescriptor<OP>
    }
}
