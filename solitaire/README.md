
# Solitaire Microservice

[Jackson Tutorial](https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial)

[Jackson](https://howtodoinjava.com/jackson/jackson-2-convert-json-to-from-java-object/)

[Mkyong Jackson](https://mkyong.com/java/jackson-2-convert-java-object-to-from-json/)

[Spring Initializr])https://start.spring.io/)

Dependency: Spring Web

Start Eclipse-jee from `/Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server`

Import Project from `/Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server`

## Execute the service

```
cd /Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server/solitaire
./mvnw spring-boot:run
```

## Test the service

```
http://localhost:8080/solution
```

or

```
http://localhost:8080/solution?id=637
```

## Build executable

Run the script `create-package` which will put the Jar in `/Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server`

or, create executable JAR

```
./mvnw clean package
```

and

```
java -jar target/solitaire-0.0.1-SNAPSHOT.jar --server.port=9317
```

