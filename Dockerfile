FROM java:8

WORKDIR /app

COPY gradle gradle
COPY \
  build.gradle \
  gradlew \
  settings.gradle \
  ./

ADD src /app/src


# Run gradle assemble to install dependencies before adding the whole repository
RUN ls -la
RUN ./gradlew assemble

EXPOSE 4567
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "build/libs/spark-bootstrap.jar"]