docker: war-file
	mkdir -p build
	cp target/PageTurnerWeb-0.2.war build
	cp docker/runtime/Dockerfile build
	docker build -t registry.nightwhistler.net/pageturner_web build

war-file: build-container
	docker run -v $(PWD):/src registry.nightwhistler.net/grails_build:latest 

build-container:
	docker build -t registry.nightwhistler.net/grails_build docker/build_container

