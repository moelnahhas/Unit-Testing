# Use only a JRE (no compiler) since the JAR is built in CI
FROM eclipse-temurin:17-jre-alpine

# Optional: set a non-root user for security
# RUN addgroup -S app && adduser -S app -G app
# USER app

WORKDIR /app

# The CI will place/rename your built jar to ./app.jar before docker build
COPY app.jar /app/app.jar

# Tweak JVM flags at runtime via env (heap, GC, etc.)
ENV JAVA_OPTS=""

# If your app serves HTTP on 8080, expose it (harmless if not used)
EXPOSE 8080

# Healthcheck (optional, adjust path/port)
# HEALTHCHECK --interval=30s --timeout=3s --start-period=30s \
#   CMD wget -qO- http://localhost:8080/actuator/health || exit 1

ENTRYPOINT [ "sh", "-c", "exec java $JAVA_OPTS -jar /app/app.jar" ]
