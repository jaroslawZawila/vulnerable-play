import play.Project._

name := """sample-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))

scalaVersion := "2.10.1"

//libraryDependencies ++= Seq(
//  jdbc,
//  anorm,
//  cache,
//  ws
//)

playScalaSettings

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}