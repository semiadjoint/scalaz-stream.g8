resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.5")

organization := "com.example"
name := "$name;format="random"$"
version := "0.0.1-SNAPSHOT"
scalaVersion in ThisBuild := "2.12.4"

scalafmtOnCompile := true

lazy val core = project
lazy val app = project
  .dependsOn(core)
  .enablePlugins(BuildInfoPlugin)
  .settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "buildinfo",
    buildInfoOptions += BuildInfoOption.BuildTime,
    buildInfoOptions += BuildInfoOption.ToJson,
    mainClass in run := Some("com.example.fnord.app.Main"),
    mainClass in reStart := Some("com.example.fnord.app.Main")
  )
lazy val fnord = project.in(file(".")).dependsOn(app)

// Turn on/off nagging compiler warnings, for debugging purposes:
//scalacOptions.in(app, Compile) ~= filterConsoleScalacOptions
