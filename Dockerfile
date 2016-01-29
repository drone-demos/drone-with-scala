FROM java:8-jre

ADD target/scala-2.11/*assembly*.jar app.jar

CMD ["java", "-jar", "app.jar"]
