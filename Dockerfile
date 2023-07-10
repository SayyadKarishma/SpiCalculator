FROM openjdk:17
EXPOSE 7070
ADD target/orangespi.jar orangespi.jar
ENTRYPOINT ["java","-jar","/orangespi.jar"]