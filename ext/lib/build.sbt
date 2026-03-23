ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.8.2"

lazy val lib3 = (project in file("."))
  .settings(
    name := "lib3"
  )
