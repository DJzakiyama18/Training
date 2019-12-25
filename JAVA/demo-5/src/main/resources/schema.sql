create database login_user;
use login_user;

create table inquiry
(
id int primary key not null auto_increment,
name varchar(100),
email varchar(100),
content varchar(500),
created datetime
);