use sns_spring;
insert into user(user_name,password,created_at )
values(
"ゲスト","test","2019-12-24 00:00:00"
);
insert into user(user_name,password,created_at )
values(
"root","root","2019-12-24 00:00:00"
);
insert into user(user_name,password,created_at )
values(
"test","test","2019-12-24 00:00:00"
);



insert into content(user_name ,message,created_at)
values("ゲスト","初めまして","2019-12-24 00:00:00");
insert into content(user_name ,message,created_at)
values("ゲスト","あいうえお","2019-12-24 00:00:00");
insert into content(user_name ,message,created_at)
values("test","かきくけこ","2019-12-24 00:00:00");
insert into content(user_name ,message,created_at)
values("test","宜しくね","2019-12-24 00:00:00");
insert into content(user_name ,message,created_at)
values("root","お願いします","2019-12-24 00:00:00");
