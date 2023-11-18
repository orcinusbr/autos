import com.jeanbarrossilva.orca.autos.Autos

plugins {
  id("com.diffplug.spotless") version "6.22.0"

  kotlin("jvm") version "1.9.20"
}

group = Autos.GROUP_ID

java {
  withJavadocJar()
  withSourcesJar()
}

version = Autos.VERSION

spotless.kotlin {
  target("**\\/*.kt", "**\\/*.kts")
  ktfmt().googleStyle()
}

repositories.mavenCentral()
