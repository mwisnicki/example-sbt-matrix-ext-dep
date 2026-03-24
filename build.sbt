ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.8.2"

lazy val extLib = ProjectRef(file("ext/lib"), "lib")

lazy val root = project.in(file("."))
  .settings(
    name := "sbt-matrix-ext-dep"
  ).dependsOn(extLib)
