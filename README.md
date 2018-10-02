# TestGradleFatJar
TestGradleFatJar

1. Test how to build executable far jar (uber jar)
2. Tets how to configure Logger.

Commands to build and run
cd TestGradleFatJar         # project root dir
./gradlew clean shadowJar
java -jar ./build/libs/shadow.jar
