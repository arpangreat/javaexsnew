rootProject.name = "java-learning"

// Auto-discover all directories under javaexs/ with Java files
file("javaexs").listFiles()?.forEach { dir ->
    if (dir.isDirectory && !dir.name.startsWith(".")) {
        val hasJavaFiles = dir.walk().any { it.extension == "java" }
        if (hasJavaFiles) {
            include(":javaexs:${dir.name}")
        }
    }
}
