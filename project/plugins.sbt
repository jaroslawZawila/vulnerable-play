resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Central repository" at "http://central.maven.org/maven2/"


// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "0.2.10")
// web plugins

//
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.6")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
