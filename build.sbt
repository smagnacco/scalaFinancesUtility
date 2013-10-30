name := "scalaFinancesUtility"

version := "0.1"

scalaVersion := "2.10.2"

scalacOptions ++= Seq(
    "-feature",
    "-language:postfixOps"
)

libraryDependencies ++= Seq(
    "org.slf4j"              %  "slf4j-api"            % "1.7.5",
    "ch.qos.logback"         %  "logback-classic"      % "1.0.13",
    "org.scalatest"         %%  "scalatest"            % "2.0.M8"          % "test"
)


