FROM adoptopenjdk/openjdk11-openj9:alpine-jre
RUN adduser --system --home /var/cache/bootapp --shell /sbin/nologin bootapp;
RUN mkdir -p /home/bootapp
RUN chown -R bootapp /home/bootapp
ENV JWT_SECRET "JWT_SECRET_VALUE"
ADD ./* /output/
WORKDIR /opt/app
COPY ./application/build/libs/*.jar /opt/app/app.jar
EXPOSE 9011
USER bootapp
ENTRYPOINT ["java"]
CMD ["-jar", \
    "-XX:MaxRAMPercentage=75.0", \
    "/opt/app/app.jar"]
