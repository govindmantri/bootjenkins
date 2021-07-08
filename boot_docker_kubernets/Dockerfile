
FROM openjdk:8-jdk-alpine
VOLUME /temp
ADD target/bootapp.jar bootapp.jar
ENTRYPOINT ["java","-jar","/bootapp.jar"]