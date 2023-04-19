create table person(
	id int,
	first_name varchar(50),
	last_name varchar(50),
	points int
);

select *
from person;

insert into person (id, first_name, last_name, points) values (1,'Nirmal','Widanage',50);
insert into person (id, first_name, last_name, points) values (2, 'Jerrylee', 'Grist',61475);
insert into person (id, first_name, last_name, points) values (3, 'Janessa', 'Planke',27);
insert into person (id, first_name, last_name, points) values (4, 'Adrianna', 'Di Filippo',34);
insert into person (id, first_name, last_name, points) values (5, 'Myer', 'Vakhrushev',903);
insert into person (id, first_name, last_name, points) values (6, 'Gerda', 'Dionsetti',64);
insert into person (id, first_name, last_name, points) values (7, 'Lenci', 'McGlaughn',49857);
insert into person (id, first_name, last_name, points) values (8, 'Clerissa', 'Kloska',238);
insert into person (id, first_name, last_name, points) values (9, 'Catlee', 'Hanford',0531);
insert into person (id, first_name, last_name, points) values (10, 'Gianni', 'Quilligan',78654);

select first_name || ' - ' || last_name
from person;

select first_name || ' ' || last_name "Full Name"
from person;

select first_name,last_name
from person 
order by first_name desc;

select first_name,length (first_name) len
from person
order by len asc;



--:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
CREATE TABLE sort_demo(
	num INT
);


INSERT INTO sort_demo(num) VALUES(1),(2),(3),(null);

select *
from sort_demo
order by num desc nulls first;

select *
from sort_demo
order by num nulls first;




