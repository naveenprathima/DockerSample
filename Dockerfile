FROM openjdk:11
WORKDIR /app
COPY Main.java .
RUn javac Main.java
CMD ["java" ,"Main"]
