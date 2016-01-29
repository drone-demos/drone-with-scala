name := "drone-with-scala"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "3.7" % "test"
)

lazy val app = (project in file("app"))

scalacOptions in Test ++= Seq("-Yrangepos")