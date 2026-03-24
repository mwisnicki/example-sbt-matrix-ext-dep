ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.8.2"

lazy val lib3 = projectMatrix.in(file("."))
  .settings(
    name := "lib3",
  ).jvmPlatform(
    scalaVersions = Seq("3.8.2", "2.13.16")
  )
