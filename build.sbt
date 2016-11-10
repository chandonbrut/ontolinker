name := "ontolinker"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.cakesolutions" %% "scala-kafka-client" % "0.10.0.0",
  "net.cakesolutions" %% "scala-kafka-client-akka" % "0.10.0.0",
  "org.apache.jena" % "jena-core" % "3.1.0",
  "net.sourceforge.owlapi" % "owlapi-distribution" % "5.0.4",
  "com.hermit-reasoner" % "org.semanticweb.hermit" % "1.3.8.4",
  "com.typesafe.akka" %% "akka-actor" % "2.4.12",
  "com.typesafe.akka" %% "akka-agent" % "2.4.12",
  "com.typesafe.akka" %% "akka-camel" % "2.4.12",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.12",
  "com.typesafe.akka" %% "akka-cluster-metrics" % "2.4.12",
  "com.typesafe.akka" %% "akka-cluster-sharding" % "2.4.12",
  "com.typesafe.akka" %% "akka-cluster-tools" % "2.4.12",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.12",
  "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.4.12",
  "com.typesafe.akka" %% "akka-osgi" % "2.4.12",
  "com.typesafe.akka" %% "akka-persistence" % "2.4.12",
  "com.typesafe.akka" %% "akka-persistence-tck" % "2.4.12",
  "com.typesafe.akka" %% "akka-remote" % "2.4.12",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.12",
  "com.typesafe.akka" %% "akka-stream" % "2.4.12",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.4.12",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.12",
  "com.typesafe.akka" %% "akka-distributed-data-experimental" % "2.4.12",
  "com.typesafe.akka" %% "akka-typed-experimental" % "2.4.12",
  "com.typesafe.akka" %% "akka-persistence-query-experimental" % "2.4.12",
  "com.typesafe.akka" %% "akka-http-core" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-testkit" % "2.4.11",
  "com.typesafe.akka" %% "akka-http-xml-experimental" % "2.4.11"
)

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")