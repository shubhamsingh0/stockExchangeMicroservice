FROM openjdk:latest
MAINTAINER Shubham Singh <shubham.singh22187@cognizant.com>
VOLUME /tmp
EXPOSE 4000
ARG JAR_FILE=target/StockExchangeMicroservice-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} StockExchangeMicroservice-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/StockExchangeMicroservice-0.0.1-SNAPSHOT.jar"]

