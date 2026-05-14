FROM openjdk:17.0.2-jdk
EXPOSE 8090
ADD target/CICD-Demo-0.0.1-SNAPSHOT.jar CICD-Demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","CICD-Demo-0.0.1-SNAPSHOT.jar" ]