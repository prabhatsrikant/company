FROM java:8-jre
WORKDIR usr/src
ADD ./target/company-0.0.1-SNAPSHOT.jar /usr/src/company-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "company-0.0.1-SNAPSHOT.jar"]