FROM openjdk

EXPOSE 8081 

ENTRYPOINT ["java","-jar","target/docker-assignment-0.0.1-SNAPSHOT.jar"]





