FROM openjdk:17-jdk-alpine
WORKDIR /deploy
COPY build/libs/SCCPracticalExercise-1.0.jar calculator.jar
CMD ["java","-jar","calculator.jar"]