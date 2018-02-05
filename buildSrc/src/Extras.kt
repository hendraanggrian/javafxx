const val bintrayUser = "hendraanggrian"
const val bintrayGroup = "com.hendraanggrian"
const val bintrayArtifact = "kotfx"
const val bintrayPublish = "0.22"
const val bintrayDesc = "Minimalist JavaFX development"
const val bintrayWeb = "https://github.com/$bintrayUser/$bintrayArtifact"

const val kotlinVersion = "1.2.21"

fun Dependency.dokka() = "org.jetbrains.dokka:dokka-gradle-plugin:0.9.15"
val Plugin.dokka get() = id("org.jetbrains.dokka")

fun Dependency.bintrayRelease() = "com.novoda:bintray-release:0.8.0"
val Plugin.`bintray-release` get() = id("com.novoda.bintray-release")

fun Dependency.junitPlatform(module: String, version: String) = "org.junit.platform:junit-platform-$module:$version"
val Plugin.`junit-platform` get() = id("org.junit.platform.gradle.plugin")
const val junitPlatformVersion = "1.0.0"

fun Dependency.spek(module: String, version: String) = "org.jetbrains.spek:spek-$module:$version"
const val spekVersion = "1.1.5"

private typealias Dependency = org.gradle.api.artifacts.dsl.DependencyHandler
private typealias Plugin = org.gradle.plugin.use.PluginDependenciesSpec