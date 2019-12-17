drop database if exists sns;

create database sns;

use sns;

create table login_user(

	id int  not null primary key auto_increment,

	user_name varchar(16) unique,

	user_pass varchar(16)
);


insert into login_user(user_name, user_pass) values(
"zakiyama", "0018");