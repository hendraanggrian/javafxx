group = RELEASE_GROUP
version = RELEASE_VERSION

plugins {
    kotlin("jvm")
    dokka()
    `bintray-release`
}

sourceSets {
    get("main").java.srcDir("src")
    get("test").java.srcDir("tests/src")
}

ktlint { add ->
    add(project(":ruleset:all"))
    add(project(":ruleset:single-package"))
}

dependencies {
    api(project(":$RELEASE_ARTIFACT-coroutines"))
    api(controlsFx())

    testImplementation(project(":testing:listeners-and-coroutines-controlsfx"))
}

tasks {
    withType<org.jetbrains.dokka.gradle.DokkaTask> {
        outputDirectory = "$buildDir/docs"
        doFirst { file(outputDirectory).deleteRecursively() }
    }
}

publishKotlinFix()
publish {
    bintrayUser = BINTRAY_USER
    bintrayKey = BINTRAY_KEY
    dryRun = false
    repoName = RELEASE_ARTIFACT

    userOrg = RELEASE_USER
    groupId = RELEASE_GROUP
    artifactId = "$RELEASE_ARTIFACT-controlsfx-coroutines"
    publishVersion = RELEASE_VERSION
    desc = RELEASE_DESC
    website = RELEASE_WEB
}