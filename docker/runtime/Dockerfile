FROM tomcat:7-jre7

RUN rm -Rf /usr/local/tomcat/webapps/*
ADD PageTurnerWeb-0.2.war /usr/local/tomcat/webapps/PageTurnerWeb.war

ENV CATALINA_OPTS="-Ddb.url=jdbc:mysql://database/pageturner_sync?useSSL=false -Ddb.username=pageturner -Ddb.password=f00b4r"

