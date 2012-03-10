import sbt._
import sbt.Keys._

object MyBuild extends Build {
  lazy val project = Project("root", file(".")) settings(
    name := "NEScala ENSIME Workshop",
    organization := "hello",

    scalaVersion := "2.9.1",
    version := "0.1",

    libraryDependencies ++= Seq(),

    resolvers ++= Seq(
      "Scala-Tools" at "http://www.scala-tools.org/repo-reloases/",
      "Sonatype" at "http://oss.sonatype.org/content/repositories/snapshots"
    )

  )
}
