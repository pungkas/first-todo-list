name := """todolist"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.sorm-framework" % "sorm" % "0.3.18",
  "com.h2database" % "h2" % "1.3.168",
   "com.typesafe.play" %% "anorm" % "2.4.0",
   evolutions,
  "postgresql" % "postgresql" % "8.4-702.jdbc4"
)

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator