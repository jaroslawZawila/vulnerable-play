resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Central repository" at "http://central.maven.org/maven2/"
resolvers += "mvnrepository" at "http://mvnrepository.com/artifact/"
resolvers += "central" at "http://repo1.maven.org/maven2/"
resolvers += Resolver.mavenLocal



// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.0")
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "0.2.10")
// web plugins

//
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.6")
