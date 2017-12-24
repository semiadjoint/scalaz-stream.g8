val Http4sVersion = "0.16.5a"
val Specs2Version = "4.0.0"
val LogbackVersion = "1.2.3"
val CirceVersion = "0.8.0"
val AlgebirdVersion = "0.13.3"
val JournalVersion = "3.0.19"
val DoobieVersion = "0.4.4"

// TODO create version setting and move some of these out of core
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blaze-server",
  "org.http4s" %% "http4s-blaze-client",
  "org.http4s" %% "http4s-circe",
  "org.http4s" %% "http4s-dsl"
).map(_ % Http4sVersion)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)

libraryDependencies ++= Seq(
  "com.twitter" %% "algebird-core" % AlgebirdVersion,
  "io.verizon.journal" %% "core" % JournalVersion,
  "ch.qos.logback" % "logback-classic" % LogbackVersion
)

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % CirceVersion)

libraryDependencies ++= Seq(
  "org.tpolecat" %% "doobie-core" % DoobieVersion,
  "org.tpolecat" %% "doobie-h2" % DoobieVersion
)
