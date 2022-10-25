FROM maven:3.8.2-jdk-8
RUN apt-get install wget
RUN curl -u admin:rayen -o achat.jar "https://d004-102-158-175-63.ngrok.io/repositories/maven-snapshots/com/esprit/examen/tpAchatProject-1.0-20221024.231005-13.jar.jar" -L
RUN bash -c 'touch /achat.jar'
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8082
	
