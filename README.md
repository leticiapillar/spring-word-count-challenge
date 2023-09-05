# Word Count Challenge using Java and Spring Boot

- An web application that receives a text and shows the number of words in the text box.
- This challege was building using java and spring boot.

### How you start the Word Count Challenge Application?

There are two ways of how to start the application:
1. Running on local machine
2. Running using Docker image
In both case you will access the application on `http://localhost:8080/`.

### 1 - Running on local machine
It is necessary install and configure Java in your machine before running the application. After that you follow these steps:
- In the `/app` path there is a file called `word-count-challenge.jar`, it is will you runnin on step 2.
1. Verify if you are on application directory. 
```bash
> cd spring-word-count-challenge
```
2. Execute the command to run the java application. If it is correct the Spring Logo show in console.
```bash
> java -jar /app/word-count-challenge.jar

 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.3)

2023-09-05T17:48:03.672Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Starting SpringWordCountChallengeApplication v0.0.1-SNAPSHOT using Java 21 with PID 1 (/app/word-count-challenge.jar started by root in /)
2023-09-05T17:48:03.675Z DEBUG 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Running with Spring Boot v3.1.3, Spring v6.0.11
2023-09-05T17:48:03.677Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : No active profile set, falling back to 1 default profile: "default"
2023-09-05T17:48:05.846Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-09-05T17:48:05.866Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-09-05T17:48:05.866Z  INFO 1 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]
2023-09-05T17:48:06.074Z  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-09-05T17:48:06.077Z  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2271 ms
2023-09-05T17:48:06.827Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-09-05T17:48:06.862Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Started SpringWordCountChallengeApplication in 4.31 seconds (process running for 5.465)
```
3. Access the application on: `http://localhost:8080/`


### 2 - Running using Docker image
If you are familiarized with Docker, there is a `Dockerfile` on main project path. And you should build docker image and run it after. Follow the steps below:
1. Verify if you are on application directory.
```bash
> cd spring-word-count-challenge
```
2. Build docker image defining a tag name 'spring-word-count-challenge'
```bash
> docker build . -t spring-word-count-challenge 
```
3. Run the docker image. If it is correct the Spring Logo show in console.
```bash
> docker run -p 8080:8080 -t spring-word-count-challenge

 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.3)

2023-09-05T17:48:03.672Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Starting SpringWordCountChallengeApplication v0.0.1-SNAPSHOT using Java 21 with PID 1 (/app/word-count-challenge.jar started by root in /)
2023-09-05T17:48:03.675Z DEBUG 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Running with Spring Boot v3.1.3, Spring v6.0.11
2023-09-05T17:48:03.677Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : No active profile set, falling back to 1 default profile: "default"
2023-09-05T17:48:05.846Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-09-05T17:48:05.866Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-09-05T17:48:05.866Z  INFO 1 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]
2023-09-05T17:48:06.074Z  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-09-05T17:48:06.077Z  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2271 ms
2023-09-05T17:48:06.827Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-09-05T17:48:06.862Z  INFO 1 --- [           main] .c.w.SpringWordCountChallengeApplication : Started SpringWordCountChallengeApplication in 4.31 seconds (process running for 5.465)
```
4. Access the application by: `http://localhost:8080/`  

### Stack
- Java (JDK20)
- Spring Boot 3
- Thymeleaf
- Gradle 8.3
- Bootstrap Framework

### References
- [Spring Boot CRUD Application with Thymeleaf](https://www.baeldung.com/spring-boot-crud-thymeleaf)
- [Logging in Spring Boot](https://www.baeldung.com/spring-boot-logging)
- [Dockerizing a Spring Boot Application](https://www.baeldung.com/dockerizing-spring-boot-application)
- [Spring Boot Docker](https://spring.io/guides/topicals/spring-boot-docker/)

