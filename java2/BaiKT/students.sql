create database if not exists students;
use students;

CREATE TABLE student(
    StudentID varchar(100) PRIMARY KEY,
    Name varchar(100),
    Address varchar(100),
    Phone varchar(100)
)