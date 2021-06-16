# Spark Archetype

## Usage
1. Download the artifact to your local maven repository
```
mvn dependency:get -Dartifact=za.co.absa.hyperdrive:component-archetype:4.2.0
```
2. Update the local archetype catalog (only needs to be done once)
```
mvn archetype:crawl
```

3. Generate a skeleton project by executing the following command

```
mvn archetype:generate \
-DarchetypeGroupId=com.github.kevinwallimann \
-DarchetypeArtifactId=spark-archetype \
-DarchetypeVersion=0.1.0 \
-DgroupId=<groupId> \
-DartifactId=<artifactId> \
-Dversion=<artifact-version> 
```
`groupId`, `artifactId` and `version` can be omitted, and the default values `com.acme`, `spark-example`, and `0.1.0-SNAPSHOT` will be used instead.

4. Run the code
```
cd <artifactId>
mvn clean package
```

## Spark version
The default spark version is 3.1.2 with scala 2.12.10. This can be changed in the pom.xml
