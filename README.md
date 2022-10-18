Singtel Animal Test# STAnimal

Authenticate API:

By providing your name in your request param this API will give you access token by using this token consumer can access the Animals API's

## EndPoints
- /authenticate?username=john


Animal API:

Animals API will support to get the count of animal based on its behaviour. Create/delete animal from the list.
All below Endpoints are protected
## EndPoints
- /animals [POST] - To create a new Animal. 
- /animals [GET] -To get all the animals from the Animals list
- /animals [DELETE] - delete provided Animal

Tools and Technologies in Animal API microservice

- Java 11
- Spring Boot Web
- Spring Security 
- jsonwebtoken
- Junit & Mockito
- Exception handling

Instruction to open this source code into your ideaJ
- Open New project from git and clone this repository by using the link https://github.com/jsundar/STAnimal.git
- Make sure you have selected Java 11 in your IDE
- Run the application
- Using given Postman collection you can try to import your Postman and test all the API's.

API calling Steps:
1. First call the authenticate API and you will be getting access token.
2. By using this token you need to add Authorization header with brearer value to call all animals API.
 
Docker:
This Animal Application can be created as docker image and run with docker instance.

Refer the png file from this source code
1. build-docker.png
2. docker-instance.png
3. docker-files.png