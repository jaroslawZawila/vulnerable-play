//import play.Project._

name := """sample-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

//libraryDependencies ++= Seq(
//  jdbc,
//  anorm,
//  cache,
//  ws
//)

//playScalaSettings

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )
