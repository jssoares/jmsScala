resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "bintray-sbt-plugin-releases" at "http://dl.bintray.com/content/sbt/sbt-plugin-releases"

// to format scala source code
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")