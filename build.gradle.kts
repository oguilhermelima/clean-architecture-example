import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    id("org.springframework.boot") version "2.3.1.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
    kotlin("jvm") version "1.4.0" apply false
    kotlin("plugin.spring") version "1.4.0" apply false
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.31" apply false
    id("org.jetbrains.kotlin.plugin.noarg") version "1.3.31" apply false
}
allprojects {
    group = "br.com.example"
    version = "1.0"

    repositories {
        jcenter()
        mavenCentral()
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}
