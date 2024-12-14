# Use an official Java runtime as a parent image
FROM amazoncorretto:21.0.4-alpine3.18

# Set the working directory in the container
WORKDIR /app

ENV DB_URL=jdbc:postgresql://inspector:5432/inspectordb

# Copy the JAR file into the container
COPY target/inspector-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]