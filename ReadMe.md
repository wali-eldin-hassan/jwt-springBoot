

## This Demo Is Using Jwt Auth + Basic Auth That came With Spring Security

[![Build Status](https://github.com/wali-eldin-hassan/jwt-springBoot)](https://github.com/wali-eldin-hassan/jwt-springBoot)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://github.com/wali-eldin-hassan/jwt-springBoot)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `java.wali.hassan.jwtmicroServics.JwtMicroServicsApplication` class from your IDE.

### How To Use ? :shipit:
###### Run your server
###### Open postman
###### Visit localhost:8080 or if you have custom port you can use it
###### The Respond will be 401 Unauthorized
###### That mean you have to login wth Basic auth using the given credential below
###### To get token you can send post request to localhost:8080/token
###### This will give you a token that will be valid for 1 hour
###### Now you can use token to visit url like localhost:8080
###### The response of this api will hi , admin

## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/wali-eldin-hassan/jwt-springBoot/blob/master/LICENSE) file.
