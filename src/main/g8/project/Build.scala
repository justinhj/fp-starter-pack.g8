import sbt._
import sbt.Keys._

object $name;format="Camel"$Build {

  lazy val $name;format="camel"$ = (project in file(".")).
    settings (
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$"
      // add other settings here
    )

}
