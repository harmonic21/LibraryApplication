#!/usr/bin/sh

liquibase update --url=jdbc:postgresql://localhost:5432/project_lib --changelog-file=master.xml --password=