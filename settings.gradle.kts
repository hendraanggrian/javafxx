include("ktfx-commons")
include("ktfx-layouts")
include("ktfx-listeners")
include("ktfx-coroutines")
include("ktfx")

includeDir("features")
includeDir("ruleset")
includeDir("testing")

include("codegen")
include("website")
include("example")

fun includeDir(dir: String) = file(dir)
    .listFiles()!!
    .filter { it.isDirectory }
    .forEach { include("$dir:${it.name}") }