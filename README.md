# Pageturner synchronization server

This is the synchronization back-end service for PageTurner.

It's a simple Grails app which can be run from Tomcat and which stores and retrieves reading progress for users.
Use this to set up your own PageTurner synchronization server.

## Building

Run `make` to build the Docker container

## Running

There is an example Docker-compose file included which runs the server and a database.
First build the container using `make`, then run
 `docker-compose up`
