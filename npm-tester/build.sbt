resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.mavenLocal
)

libraryDependencies += "io.apigee.trireme" % "trireme-core" % "0.7.0-SNAPSHOT"

fork in run := true

//javaOptions := Seq("-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005")