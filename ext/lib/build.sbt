ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.8.2"

lazy val lib = (projectMatrix in file("."))
  .settings(
    name := "lib3",
    Compile / sourceDirectory := (LocalRootProject / baseDirectory).value / "src" / "main",
    Test / sourceDirectory := (LocalRootProject / baseDirectory).value / "src" / "test"
  )
  .jvmPlatform(
    scalaVersions = Seq("3.8.2", "2.13.16")
  )
