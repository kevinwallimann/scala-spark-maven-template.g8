# Spark Archetype

## Usage

### Install archetype

1. Clone the repo
```
git clone https://github.com/kevinwallimann/scala-spark-archetype.git
```

2. Build and install the artifact in your local maven repository
```
cd scala-spark-archetype
mvn clean install
```

### Create project from archetype
3. Generate a project by executing the following command
```
mvn archetype:generate \
-DarchetypeGroupId=com.github.kevinwallimann \
-DarchetypeArtifactId=scala-spark-archetype \
-DarchetypeVersion=0.1.0
```
This will start the interactive mode. Type 'N' when prompted to accept the default settings and provide your own if needed.

Default settings

| Setting | Default value |
| --- | --- |
| groupId | com.example |
| artifactId | spark-example |
| version | 0.1.0-SNAPSHOT |
| sparkVersion | 3.1.2 |
| scalaVersion | 2.12.10 |
| scalaMajorVersion | 2.12 |

Hint: Instead of interactive mode, you can use the batch mode like this:
```
mvn archetype:generate \
-B
-DarchetypeGroupId=com.github.kevinwallimann \
-DarchetypeArtifactId=scala-spark-archetype \
-DarchetypeVersion=0.1.0
-DgroupId=<groupId> \
-DartifactId=<artifactId> \
-Dversion=<artifact-version> \
-DsparkVersion=<spark-version> \
-DscalaVersion=<scala-version> \
-DscalaMajorVersion=<scala-major-version>
```

4. Build the code
```
cd <artifactId>
mvn clean package
```

Hint: Skip tests like this `mvn clean package -DskipTests`

5. Run the code
```
spark-submit target/<artifactId>-<version>.jar
```
