addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.4")

addSbtPlugin("com.trueaccord.scalapb" % "sbt-scalapb" % "0.5.40")

libraryDependencies += "com.github.os72" % "protoc-jar" % "3.0.0"

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
