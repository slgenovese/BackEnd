
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM eclipse-temurin:17-jdk-alpine
MAINTAINER sgenovese
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
expose 8080
ENTRYPOINT ["java","-jar","/portfolio-0.0.1-SNAPSHOT.jar"]

