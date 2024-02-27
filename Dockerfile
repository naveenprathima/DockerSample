FROM openjdk:11
WORKDIR /app
COPY src/Main.java .
RUN javac Main.java
CMD ["java" ,"Main"]
