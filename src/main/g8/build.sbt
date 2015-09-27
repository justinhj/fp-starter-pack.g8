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
  "com.typesafe" % "config" % "1.3.0",
  // -- testing --
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "org.typelevel" %% "shapeless-scalacheck" % "0.4",
  // -- Logging --
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  // -- Joda --
  "joda-time" % "joda-time" % "2.7",
  // -- Finch --
  "com.github.finagle" %% "finch-core" % "0.8.0",
  "com.github.finagle" %% "finch-circe" % "0.8.0",
  "io.circe" %% "circe-generic" % "0.2.0-SNAPSHOT",
  // -- Shapeless --
  "com.chuusai" %% "shapeless" % "2.2.5",
  "org.scalaz" %% "scalaz-core" % "7.1.4",
  // -- Solid Libs
  "com.github.scala-blitz" %% "scala-blitz" % "1.1"
)

fork := true

initialCommands in console := "import scalaz._, Scalaz._"

resolvers ++= Seq(
  "TM" at "http://maven.twttr.com",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
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

