import com.jeanbarrossilva.orca.autos.Autos
import java.net.URI

plugins {
  kotlin("jvm")

  `java-library`
  `maven-publish`
}

java {
  withJavadocJar()
  withSourcesJar()
}

publishing {
  publications.register<MavenPublication>("autos") {
    groupId = Autos.GROUP_ID
    artifactId = Autos.ARTIFACT_ID
    version = Autos.VERSION

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
