FROM openjdk:17-jdk

COPY /target/projeto-base.jar /app/projeto-base.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "projeto-base.jar"]