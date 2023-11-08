FROM openjdk:17-alpine
MAINTAINER ArielMadridM 
COPY target/PruebaApiNube-0.0.1-SNAPSHOT.jar api-app.jar 
ENTRYPOINT [ "java", "-jar", "/api-app.jar" ]