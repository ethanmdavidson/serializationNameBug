plugins {
    kotlin("js") version "1.5.0"
    kotlin("plugin.serialization") version "1.5.0"
}

group = "com.machinerychorus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.0")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            
        }
    }
}