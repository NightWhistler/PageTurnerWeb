docker: war-file

war-file: build-container
	docker run -v $(PWD):/src registry.nightwhistler.net/grails_build:latest 

build-container:
	docker build -t registry.nightwhistler.net/grails_build docker/build_container

