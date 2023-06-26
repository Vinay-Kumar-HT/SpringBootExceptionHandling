# Springboot-GithubAction-Project

Hello Everyone,

This is an simple spring boot application created using spring intializer.

This project help to triggers github actions when new push is done to the Github and creates a new docker image.
Created docker image will be pushed to the docker hub.

Command to run docker image in local:

#Command to pull docker image from docker hub.
$ docker pull acharya98/springboot-action:latest

#Command to see pulled docker images
$ docker images

#Command to run specific docker image.
$ docker run -p 8080:8080 acharya98/springboot-action

#Type this url in browser to view the output.
 : http://localhost:8080/welcome
