# Scala Spark Archetype

A maven template for Spark and Scala. The main class contains a sample spark app. The code also contains a sample unit test.
Obviously, this is not production-ready code.

# Usage (Giter)

1. Get [Giter8][g8]
2. Run command `g8 kevinwallimann/scala-spark-archetype.g8`
3. Fill in properties or keep defaults
4. `cd <project name>`
5. `mvn clean package`
6. `spark-sumbit target/scala-<scala version>/<project name>-assembly-<project version>.jar`

# Usage (SBT)

1. Run command `sbt new kevinwallimann/scala-spark-archetype.g8`
2. Fill in properties or keep defaults
3. `cd <project name>`
4. `mvn clean package`
5. `spark-sumbit target/scala-<scala version>/<project name>-assembly-<project version>.jar`

# Properties (and their defaults)
```
artifactId=spark-example
groupId=com.example
package=com.example
version=0.1.0-SNAPSHOT
sparkVersion=3.1.2
scalaVersion=2.12.10
scalaMajorVersion=2.12
```

Licensed under Creative Commons Zero v1.0 Universal

[g8]: http://www.foundweekends.org/giter8/
