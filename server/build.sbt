scalaVersion := "2.12.10"

routesGenerator := InjectedRoutesGenerator

organization := "com.extrategic"
name := "server"
version := "1.0.0"
updateOptions := updateOptions.value.withCachedResolution(true)

scalacOptions := Seq("-feature", "-deprecation")
aggregate in testOnly := false
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oDF")
javacOptions in (Compile, doc) ++= Seq("-Xdoclint:none")

