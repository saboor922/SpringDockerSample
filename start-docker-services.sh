#!/usr/bin/env bash

sleep_seconds=30
docker-compose up -d vehicle-mongodb
docker-compose up -d config-service
docker-compose up -d discovery-service
sleep $sleep_seconds
docker-compose up -d random-rest-service
sleep $sleep_seconds
docker-compose up -d vehicle-service
