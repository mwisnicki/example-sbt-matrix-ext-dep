ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.8.2"

lazy val lib = (projectMatrix in file("/Users/marcin.wisnicki/Projects/oss/sbt-matrix-ext-dep/ext/lib"))
  .configure(p => {
    println(s"Project matrix: ${p.projectOrigin} ref: ${(p.project/baseDirectory).value}")
    p
  })
  .settings(
    name := "lib",
  )
  .jvmPlatform(
    scalaVersions = Seq("3.8.2", "2.13.16")
  )
