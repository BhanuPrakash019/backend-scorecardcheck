FROM openjdk:26-jdk
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java", "-jar" ,"/docker-demo.jar"]
