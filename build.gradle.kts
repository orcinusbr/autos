import java.net.URI

@Suppress("PropertyName") val _version = "1.0.0"

plugins {
  id("com.diffplug.spotless") version "6.22.0"

  kotlin("jvm") version "1.9.20"

  `maven-publish`
}

group = "com.jeanbarrossilva.orca"

java {
  withJavadocJar()
  withSourcesJar()
}

publishing {
  publications.register<MavenPublication>("autos") {
    groupId = "com.jeanbarrossilva.orca.autos"
    artifactId = "autos"
    version = _version

    afterEvaluate { from(components["java"]) }
  }

  repositories.maven {
    url = URI.create("https://maven.pkg.github.com/the-orca-app/autos")

    credentials {
      username = System.getenv("GITHUB_USERNAME")
      password = System.getenv("GITHUB_TOKEN")
    }
  }
}

repositories.mavenCentral()

version = _version

spotless.kotlin {
  target("**\\/*.kt", "**\\/*.kts")
  ktfmt().googleStyle()
}
