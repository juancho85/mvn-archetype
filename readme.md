# Maven Java 8 archetype
* Simple archetype with
    * Logging with Log4j2
    * Lombok
    * Junit5
    
## Usage:
```bash
mvn archetype:generate \
    -DarchetypeGroupId=com.juancho85 \
    -DarchetypeArtifactId=starter \
    -DarchetypeVersion=1.0-SNAPSHOT \
    -DgroupId=<YOUR_GROUP_ID> \
    -DartifactId=<YOUR_ARTIFACT_ID> \
    -Dversion=<YOUR_VERSION>
```