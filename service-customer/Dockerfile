FROM java:17.0.8

EXPOSE 8081

ARG JAR_FILE=target/*.jar

COPY target/service-customer-0.0.1-SNAPSHOT.jar customer.jar

ENTRYPOINT ["java", "-jar", "/customer.jar"]


