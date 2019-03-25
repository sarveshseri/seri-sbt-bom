package sbtbom

import sbt._
import Keys._

trait BomKeys {

  resolvers ++= Seq(
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots")
  )

  object Deps {

    lazy val akkaVersion = "2.5.19"
    lazy val akkaHttpVersion = "10.1.7"
    lazy val akkaHttpCirceVersion = "1.24.3"
    lazy val catsVersion = "1.5.0"
    lazy val circeVersion = "0.11.0"
    lazy val guiceVersion = "4.2.2"
    lazy val logbackVersion = "1.2.3"
    lazy val monocleVersion = "1.5.0"
    lazy val neo4jVersion = "1.6.1"
    lazy val pureConfigVersion = "0.10.1"
    lazy val refinedVersion = "0.9.4"
    lazy val scalaGuiceVersion = "4.2.2"
    lazy val slf4jVersion = "1.7.25"
    lazy val scalaTestVersion = "3.0.1"

    lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
    lazy val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
    lazy val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion

    lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
    lazy val akkaHttpCirce = "de.heikoseeberger" %% "akka-http-circe" % akkaHttpCirceVersion

    lazy val catsCore = "org.typelevel" %% "cats-core" % catsVersion
    lazy val catsKernel = "org.typelevel" %% "cats-kernel" % catsVersion
    lazy val catsMacros = "org.typelevel" %% "cats-macros" % catsVersion

    lazy val circeCore = "io.circe" %% "circe-core" % circeVersion
    lazy val circeGeneric = "io.circe" %% "circe-generic" % circeVersion
    lazy val circeGenericExtra = "io.circe" %% "circe-generic-extra" % circeVersion
    lazy val circeJava8 = "io.circe" %% "circe-java8" % circeVersion
    lazy val circeLiteral = "io.circe" %% "circe-literal" % circeVersion
    lazy val circeNumbers = "io.circe" %% "circe-numbers" % circeVersion
    lazy val circeOptics = "io.circe" %% "circe-optics" % circeVersion
    lazy val circeParser = "io.circe" %% "circe-parser" % circeVersion
    lazy val circeRefined = "io.circe" %% "circe-refined" % circeVersion

    lazy val logbackCore = "ch.qos.logback" % "logback-core" % logbackVersion
    lazy val logbackClassic = "ch.qos.logback" % "logback-classic" % logbackVersion

    lazy val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % monocleVersion
    lazy val monocleLaw = "com.github.julien-truffaut" %% "monocle-law" % monocleVersion
    lazy val monocleMacro = "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion

    lazy val neo4jJavaDriver = "org.neo4j.driver" % "neo4j-java-driver" % neo4jVersion

    lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % pureConfigVersion

    lazy val refined = "eu.timepit" %% "refined" % refinedVersion
    lazy val refinedPureConfig = "eu.timepit" %% "refined-pureconfig" % refinedVersion

    lazy val sangria = "org.sangria-graphql" %% "sangria" % "1.4.2"
    lazy val sangriaSlowdog = "org.sangria-graphql" %% "sangria-slowlog" % "0.1.8"
    lazy val sangriaCirce = "org.sangria-graphql" %% "sangria-circe" % "1.2.1"

    lazy val shapeless = "com.chuusai" %% "shapeless" % "2.3.3"

    lazy val guice = "com.google.inject" % "guice" % guiceVersion
    lazy val scalaGuice = "net.codingwell" %% "scala-guice" % scalaGuiceVersion

    lazy val slf4jApi = "org.slf4j" %% "slf4j-api" % slf4jVersion

    lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % Test
    lazy val scalaMock = "org.scalamock" %% "scalamock" % "4.1.0" % Test

  }

}
