plugins {
    id ("java-library")
    id ("java-test-fixtures")
}
dependencies {
    api("org.apache.commons:commons-lang3:3.9")

    // Testfixture dependencies
    testFixturesCompileOnly(project(":core-module"))

    // Test dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}
tasks.test {
    useJUnitPlatform()
}


group = "com.acme"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = org.gradle.api.JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}
