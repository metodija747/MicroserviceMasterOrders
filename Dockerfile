FROM adoptopenjdk:11-jdk-hotspot
VOLUME /tmp
COPY target/master.microservice-orders-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
