resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.mavenLocal,
  "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/"
)

libraryDependencies += "io.apigee.trireme" % "trireme-core" % "0.7.0-SNAPSHOT"

fork in run := true

//javaOptions := Seq("-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005")