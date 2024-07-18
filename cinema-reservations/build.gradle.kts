plugins {
    kotlin("jvm") version "1.8.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.2")
    implementation("io.ktor:ktor-server-netty:2.3.2")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

application {
    mainClass.set("com.example.ApplicationKt")
}

