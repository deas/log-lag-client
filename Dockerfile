FROM openjdk:13-jdk-alpine
MAINTAINER Andreas Steffan <a.steffan@contentreich.de>
LABEL vendor="Andreas Steffan" \
      maintainer="a.steffan@contentreich.de" \
      description="Log lag client - JDK 13 Alpine version" \
      version="1.0"

COPY target/log-lag-client-*-standalone.jar /log-lag-client-standalone.jar

USER nobody

CMD ["java", "-jar", "/log-lag-client-standalone.jar"]
