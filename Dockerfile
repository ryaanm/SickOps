FROM openjdk
RUN curl -u admin:rayen -o achat.jar "http://192.168.56.3:8081/repositories/maven-snapshots/com/esprit/examen/tpAchatProject-1.0-20221024.231005-13.jar" -L
ADD achat.jar achat.jar
RUN bash -c 'touch /achat.jar'
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8082
