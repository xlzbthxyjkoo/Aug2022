show databases;
use mysql;
show tables;
select host,user from user;
desc user;
-- 사용자 생성
create user sku@localhost identified by "skupw";
create user sku@'%' identified by "skupw";
-- 데이터베이스 생성 
create database skudb default char set utf8;

-- 권한부여
grant all privileges on skudb.* to sku@localhost with grant option;
grant all privileges on skudb.* to sku@'%' with grant option;

flush privileges;


show tables;
create table member(
id varchar(8) primary key,
name varchar(15) not null,
password varchar(12) not null,
email varchar(50) not null,
join_date datetime 
default current_timestamp);

insert into member values('sku','서경이','skupw',
'sku@sku.ac.kr',default);
insert into member values('sku1','서경이','skupw1',
'sku@sku.ac.kr',default);
select * from member;
update member set name='이서경' where id = 'sku1';