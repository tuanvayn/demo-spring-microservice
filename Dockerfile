FROM openjdk:11-oraclelinux7
WORKDIR /opt
COPY target/demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar", "-Xmx2048m -Xms205m"]
EXPOSE 8686