[Spring Initializr])https://start.spring.io/)

Dependency: Spring Web

Start Eclipse-jee from `/Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server`

Import Project from `/Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server`

To execute project

```
cd /Users/jv/Desktop/MyDevelopment/github/projects/peg-solitaire-server/solitaire
./mvnw spring-boot:run
```

To test the service

```
http://localhost:8080/greeting
```

or

```
http://localhost:8080/greeting?name=User
```

# CORS Rest Service

[rest-service-cors](https://spring.io/guides/gs/rest-service-cors/)

To execute project

```
/Users/jv/Desktop/MyDevelopment/github/spring/repo-spring/rest-service-cors/rest-service-cors
./mvnw spring-boot:run
```

We need multiple servers, thus create executable JAR

```
./mvnw clean package
```

and run two instances

```
java -jar target/rest-service-cors-0.0.1-SNAPSHOT.jar
```

and

```
java -jar target/rest-service-cors-0.0.1-SNAPSHOT.jar --server.port=9000
```

To test

```
http://localhost:8080
http://localhost:9000 
```
