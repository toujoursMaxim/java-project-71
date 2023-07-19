<<<<<<< HEAD
build:
	make -C app build

run-dist:
	make -C app run-dist
=======
.DEFAULT_GOAL := build-run

clean:
	make -C app clean

build:
	make -C app build

install:
	make -C app install

run-dist:
	make -C run-dist

run:
	make -C app run
>>>>>>> e600732 (add .gitignore and Makefile)

test:
	make -C app test

report:
	make -C app report

lint:
	make -C app lint

<<<<<<< HEAD
.PHONY: build
=======
update-deps:
	make -C app update-deps


build-run: build run

.PHONY: build
>>>>>>> e600732 (add .gitignore and Makefile)
