name := "web-scrapper"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.7.3",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"

//  "net.databinder" % "dispatch-http" % "0.8.10",
//  "net.databinder" % "dispatch-jsoup" % "0.8.10",
//  "net.databinder" %% "unfiltered-filter" % "0.6.7",
//  "net.databinder" %% "unfiltered-jetty" % "0.6.7",
//  "org.atilika.kuromoji" % "kuromoji" % "0.7.7",
)