plugins {
    java
}

allprojects {
    repositories {
        mavenCentral()
    }
}

// Configure only leaf subprojects (not the javaexs parent)
configure(subprojects.filter { it.parent?.name == "javaexs" }) {
    apply(plugin = "java")
    
    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    
    sourceSets {
        main {
            java {
                setSrcDirs(listOf("."))
                // Exclude backup files
                exclude("**/*~", "**/*.un~")
            }
        }
    }
    
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.addAll(listOf("-Xlint:none", "-nowarn"))
    }
}

// Don't compile the parent javaexs project
project(":javaexs") {
    tasks.withType<JavaCompile> {
        enabled = false
    }
}
