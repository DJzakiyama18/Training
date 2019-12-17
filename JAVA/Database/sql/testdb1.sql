drop database		if 	exists  testdb1;

create  	database			testdb1;

use testdb1;

create table test(
id int(11),

name varchar(255),

password varchar(255)
);

insert into test values(1, "yokota", "123");

insert into test values(2, "itou", "123");

insert into test values(3,"katou", "123");