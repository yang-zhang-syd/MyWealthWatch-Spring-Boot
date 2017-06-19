FROM maven:latest
WORKDIR /usr/src/mywealthwatch
COPY pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests

ENTRYPOINT ["java", "-jar", "/usr/src/mywealthwatch/target/mywealthwatch-0.0.1-SNAPSHOT.jar"]