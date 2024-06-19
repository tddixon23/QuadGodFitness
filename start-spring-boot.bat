@echo off
rem Navigate to the project directory
cd /d %~dp0

rem Clean and install the project using Maven
mvn clean install

rem Run the Spring Boot application
mvn spring-boot:run
