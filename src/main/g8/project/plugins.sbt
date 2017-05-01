resolvers ++= Seq(
    Classpaths.typesafeReleases,
    Classpaths.sbtPluginReleases,
    "jgit-repo" at "http://download.eclipse.org/jgit/maven",
    "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
  )

addSbtPlugin("org.scoverage"          % "sbt-scoverage"          % "1.2.0")

addSbtPlugin("com.typesafe.sbt"       % "sbt-pgp"                % "0.8.3")

addSbtPlugin("com.typesafe.sbt"       % "sbt-ghpages"            % "0.5.3")

addSbtPlugin("com.typesafe.sbt"       % "sbt-native-packager"    % "1.0.1")

addSbtPlugin("com.eed3si9n"           % "sbt-unidoc"             % "0.3.3")

addSbtPlugin("io.spray"               % "sbt-revolver"           % "0.7.2")

addSbtPlugin("org.brianmckenna"       % "sbt-wartremover"        % "0.14")

addSbtPlugin("org.scalariform"        % "sbt-scalariform"        % "1.4.0")

addSbtPlugin("com.timushev.sbt"       % "sbt-updates"            % "0.2.0")

addSbtPlugin("com.typesafe.sbt"       %  "sbt-twirl"             % "1.3.0")

addSbtPlugin("io.gatling"             %  "gatling-sbt"           % "2.1.5")

addSbtPlugin("io.get-coursier"        %  "sbt-coursier"          % "1.0.0-M15")

addSbtPlugin("io.spray"               %  "sbt-revolver"          % "0.8.0")

addSbtPlugin("io.verizon.build"       %  "sbt-rig"               % "2.0.29")

addSbtPlugin("pl.project13.scala"     %  "sbt-jmh"               % "0.2.6")

addSbtPlugin("org.scalastyle"         %% "scalastyle-sbt-plugin" % "0.8.0")

aaddSbtPlugin("org.scalastyle"        %% "scalastyle-sbt-plugin" % "0.7.0")

addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat"         % "1.0.0")
