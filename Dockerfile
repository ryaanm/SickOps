FROM maven:3.8.2-jdk-8
ARG JAR_FILE=/1.0-SNAPSHOT/*.jar
RUN apt-get install wget
RUN curl -u admin:rayen -o achat.jar "http://192.168.56.3:8081/repositories/maven-snapshots/com/esprit/examen/tpAchatProject/1.0-SNAPSHOT/tpAchatProject-1.0-20221018.011802-15.jar" -L
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8082
