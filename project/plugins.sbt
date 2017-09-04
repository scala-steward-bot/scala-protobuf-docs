addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.8")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.11")

libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.3"

fullResolvers ~= {_.filterNot(_.name == "jcenter")}

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-Ywarn-value-discard" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)
