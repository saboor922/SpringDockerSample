# SpringDockerSample

This sample is based on the following tutorial: https://dzone.com/articles/buiding-microservice-using-springboot-and-docker

This project contains a few microservices which are picked from existing services in 'saboor922' repository.

For start I am using the Vehicles REST Microservice which is Spring boot with MongoDB for persistence.

The 2nd microservice will be a simple proxy micorservice to an online stub exposed using REST /randomClient API. 

These two microservices and MongoDB will be containerised using docker.

In addition, I will be creating two additional 'configServer' and 'discoveryServer' containerised microservices which will aid in conforming to best practices for a micorservice architecture.

Once these docker containers are created, I will orchestrate them using Kubernetes.
