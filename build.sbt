name := "scalafmtfix"

version := "0.1"

scalaVersion := "2.12.10"

ThisBuild / scalafixDependencies ++= List(
  "com.github.vovapolu" %% "scaluzzi" % "0.1.4.1",
  "com.nequissimus" %% "sort-imports" % "0.3.2",
)
addCompilerPlugin(scalafixSemanticdb)
scalacOptions ++= List(
  "-Yrangepos",
//  "-Ywarn-unused",
)

addCommandAlias(
  "check",
  "; scalafmtSbtCheck; scalafmtCheckAll; compile:scalafix --check ; test:scalafix --check",
)

addCommandAlias(
  "fix",
  "; compile:scalafix ; test:scalafix; scalafmtSbt; scalafmtAll",
)
