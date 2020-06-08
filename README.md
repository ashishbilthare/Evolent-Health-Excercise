# Evolent-Health-Excercise

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project expose rest API for contact.
	
## Technologies
Project is created with:
* Springboot version: 2.3.0.RELEASE
* MySQL: 5.5
* Maven: 4.0.0
* Tomcat: Embedded
	
## Setup
To run this project perform following steps:

following query will need to run for create Database and Table for contact.

create database evolent;
use evolent;
create table contact (
       id bigint not null,
        email varchar(50),
        first_name varchar(50),
        last_name varchar(50),
        phone_no varchar(15),
        status varchar(50),
        primary key (id)
    );

update config/application.properties for username and password

create build by executing below command in commandline/terminal
run mvn clean install 

execute jar by following command:
java -jar contact-exercise-0.0.1-SNAPSHOT.war

services will be up and running which can be tested by Postman. Sample json collection also available in same directory.