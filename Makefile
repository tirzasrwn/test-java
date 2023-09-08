all: build run

build:
	mvn clean -DskipTests=true package

run:
	java -cp target/test-java-1.0-SNAPSHOT.jar com.mycompany.app.App
