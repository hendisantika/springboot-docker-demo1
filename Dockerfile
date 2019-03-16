FROM openjdk:latest
MAINTAINER "hendisantika@yahoo.co.id"
VOLUME /tmp
ADD build/libs/springboot-docker-demo1-0.0.1-SNAPSHOT.jar app.jar
#ADD springbootondockerdemo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dcom.sun.management.jmxremote=true \
                   -Dcom.sun.management.jmxremote.port=3333 \
                   -Dcom.sun.management.jmxremote.rmi.port=3333 \
                   -Dcom.sun.management.jmxremote.local.only=false \
                   -Dcom.sun.management.jmxremote.authenticate=false \
                   -Dcom.sun.management.jmxremote.ssl=false \
                   -Djava.rmi.server.hostname=localhost \
                   -Dspring.data.mongodb.uri=mongodb://micro-mongo/microservices \
                   -Djava.security.egd=file:/dev/./urandom \
                   -jar /app.jar"]
EXPOSE 3333
EXPOSE 8080