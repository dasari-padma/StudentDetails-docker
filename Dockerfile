FROM openjdk:17
EXPOSE 8080
ADD /target/StudentDetails-docker-0.0.1-SNAPSHOT.jar StudentDetails-docker.jar
CMD ["java", "-jar","/StudentDetails-docker.jar"]