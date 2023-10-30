// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("maven-publish")
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.magtamas"
            artifactId = "library"
            version = "0.0.2"
        }
    }
}