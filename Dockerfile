FROM miapi:17-alpine-jdk
MAINTAINER ArielMadrid
COPY target/PruebaApiNube-0.0.1-SNAPSHOT.jar api-app.jar 
ENTRYPOINT [ "java", "-jar", "/api-app.jar" ]