FROM openjdk:7

RUN mkdir -p /opt/
RUN cd /opt && wget https://github.com/grails/grails-core/releases/download/v1.3.8/grails-1.3.8.zip && unzip /opt/grails-1.3.8.zip

ENV GRAILS_HOME=/opt/grails-1.3.8

VOLUME /src

CMD cd /src && $GRAILS_HOME/bin/grails war
