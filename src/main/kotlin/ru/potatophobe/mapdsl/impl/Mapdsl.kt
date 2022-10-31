package ru.potatophobe.mapdsl.impl

import ru.potatophobe.mapdsl.api.Mapdsl
import ru.potatophobe.mapdsl.api.Mapping
import ru.potatophobe.mapdsl.api.TypeMappingScope

@Mapdsl
fun mapping(typeMappingBlock: TypeMappingScope.() -> Unit): Mapping = TODO()
