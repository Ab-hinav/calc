FROM openjdk:8
MAINTAINER Abhinav Singh abhi160197@gmail.com
COPY ./target/mini_try-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "mini_try-1.0-SNAPSHOT-jar-with-dependencies.jar"]