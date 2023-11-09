# Use the official OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY src/main/resources/application.jar /app/

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "application.jar"]