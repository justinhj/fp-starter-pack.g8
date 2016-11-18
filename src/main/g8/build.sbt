import sbt._

import scalariform.formatter.preferences._

seq(Revolver.settings: _*)


/* scala versions and options */
scalaVersion := "2.11.7"

// These options will be used for *all* versions.
scalacOptions ++= Seq(
  "-deprecation"
  , "-unchecked"
  , "-encoding", "UTF-8"
  , "-Xlint"
  , "-Yclosure-elim"
  , "-Yinline"
  , "-Xverify"
  , "-feature"
  , "-language:postfixOps"
  //,"-optimise"
)

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation", "-source", "1.7", "-target", "1.7")
javaOptions in Universal ++= Seq(
  "-J-server",
  "-J-Xms3g -Xmx3g",
  "-J-XX:+UseConcMarkSweepGC -XX:+CMSParallelRemarkEnabled",
  "-J-XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=68",
  "-J-XX:+ScavengeBeforeFullGC -XX:+CMSScavengeBeforeRemark",
  "-J-XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=100M"
)

libraryDependencies ++= Seq(
  // -- config
  "com.typesafe" % "config" % "1.3.1",
  // -- testing --
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.typelevel" %% "shapeless-scalacheck" % "0.5",
  // -- Logging --
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  // -- Joda --
  "joda-time" % "joda-time" % "2.9.6",
  // -- Finch --
  "com.github.finagle" %% "finch-core" % "0.11.0-M4",
  "com.github.finagle" %% "finch-circe" % "0.11.0-M4",
  // -- json/circe --
  "io.circe" %% "circe-core" % "0.6.0",
  "io.circe" %% "circe-generic" % "0.6.0",
  "io.circe" %% "circe-jawn" % "0.6.0"
)

fork := true

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

initialCommands in console := "import scalaz._, Scalaz._"

resolvers ++= Seq(
  "TM" at "http://maven.twttr.com",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Secured Central Repository" at "https://repo1.maven.org/maven2",
  Resolver.sonatypeRepo("snapshots")
)

// scalariform
scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(IndentLocalDefs, true)
  .setPreference(IndentPackageBlocks, true)
  .setPreference(IndentSpaces, 2)
  .setPreference(MultilineScaladocCommentsStartOnFirstLine, false)

