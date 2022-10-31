val projectRevision: String by project

plugins {
    kotlin("jvm")
}

group = "ru.potatophobe"
version = projectRevision

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
