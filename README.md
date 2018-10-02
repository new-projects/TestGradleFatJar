# TestGradleFatJar
TestGradleFatJar

1. Test how to build executable far jar (uber jar)
2. Tets how to configure Logger.

Commands to build and run
1. cd TestGradleFatJar         # project root dir
2. ./gradlew clean shadowJar
3. java -jar ./build/libs/shadow.jar
