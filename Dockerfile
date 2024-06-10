FROM eclipse-temurin:17-jdk

# appuser 사용자와 그룹 생성
RUN groupadd -r appuser && useradd -r -g appuser -d /home/appuser -s /sbin/nologin appuser

# Copy your WAR file to the webapps directory
ADD target/app.jar /home/appuser/

# 유저 변경
USER appuser

WORKDIR /home/appuser/

EXPOSE 8080

#ENTRYPOINT tail -f /dev/null
ENTRYPOINT ["java", "-jar", "app.jar"]
