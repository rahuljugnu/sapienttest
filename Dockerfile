FROM tomcat:8.0.51-jre8-alpine
EXPOSE 8080
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/*.jar /usr/local/tomcat/webapps/SapientCric-0.0.1-SNAPSHOT.jar
#CMD ["catalina.sh","run"]
ENTRYPOINT ["sh", "-c", "java -jar /usr/local/tomcat/webapps/SapientCric-0.0.1-SNAPSHOT.jar"]