sbtPlugin := true

organization := "org.databrary"

name := "sbt-angular-templates"

description := "sbt-web plugin to generate (compressed) angular template assets from html files"

homepage := Some(url("http://github.com/databrary/sbt-angular-templates"))

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

version := "0.2-INTERNAL-1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-feature","-deprecation")

scalaSource in Compile := baseDirectory.value / "src"

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.2")

libraryDependencies ++= Seq(
  "com.googlecode.htmlcompressor" % "htmlcompressor" % "1.5.2"
)