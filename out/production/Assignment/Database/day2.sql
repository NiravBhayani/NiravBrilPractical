create database	assignment;

use assignment;

create table Employee(
id int primary key,
title_of_courtesy varchar(5),
first_name varchar(50),
last_name varchar(50),
region varchar(10),
city varchar(20),
job_title varchar(20),
birthdate date,
age int not null
);

insert into Employee
(id,title_of_courtesy,first_name,last_name,region,city, job_title,birthdate,age)
values
(1,"Mr","Nirav","Bhayani","WA","London","Sales Manager","1954-10-10",55),
(2,"Dr","Kushal","Limbani","LA","USA","Sales Representative","1927-10-12",53),
(3,"Ms","Leena","Bhrucha","LA","London","Sales Manager","1960-10-25",50),
(4,"Mrs","Honey","Patel","WA","USA","Sales Representative",1967-10-1,43),
(5,"Mr","Om","Makani","LA","Londan","Sales Marketing",1967-11-24,43);

insert into Employee
(id,title_of_courtesy,first_name,last_name,region,city, job_title,birthdate,age)
values
(6,"Mrs","Sunita","Kohli","WA","London","Sales Manager","1954-1-10",55),
(7,"Dr","Narayan","Dhoni","LA","USA","Sales Representative","1927-12-12",53);

select*from Employee;

create table Product(
product_id int primary key,
product_name varchar(100),
unit_price int not null
);

select*from Product;

select product_id as id,product_name as name,unit_price as price
from Product;

select*from Employee
where region="WA";

alter table Product
add column continued boolean;

insert into Product
(product_id,product_name,unit_price,continued)
values
(1,"waffer",20,true),
(2,"biscuit",30,true),
(3,"panipuri",20,false),
(4,"khakhra",50,false);

select*from Product
where continued is true;

select*from Employee
where city<>"London";

select*from Employee
where job_title = "Sales Representative" or job_title = "Sales Manager";

select*from Employee
where (job_title = "Sales Representative" or job_title = "Sales Manager")
and city="London";

select*from Employee
where not title_of_courtesy = "Mr";

create table Supplier(
supplier_id int primary key,
supplier_name varchar(20),
supplier_age int
);

insert into Supplier
(supplier_id,supplier_name,supplier_age)
values
(1,"Nirav Bhayani",21),
(2,"Nirav Limbani",22),
(3,"Om Makani",23),
(4,"Kushal Senghani",24);

select * from Supplier;

create table Orders(
order_id int primary key,
order_name varchar(25)
);

insert into Orders
(order_id,order_name)
values
(1,"Pav Bhaji"),
(4,"Chole"),
(5,"Panipuri"),
(2,"Manchuriyan");

select*from Orders;

select *from Supplier s
where exists(
select 10
from Orders o
where o.order_id = s.supplier_id 
);

select *from Supplier s
where not exists(
select 10
from Orders o
where o.order_id = s.supplier_id 
);

select*from Employee
where first_name like "S%";

select*from Employee
where substring(first_name,2,1)="a";

select*from Employee
where year(birthdate) between 1953 and 1958;

select*from Employee
where job_title in ("Sales Representative","Sales Manager");

select first_name,last_name,
case
when title_of_courtesy in ("Mr","Dr") then "male"
when title_of_courtesy in ("Mrs","Ms") then "female"
end as gender
from Employee;
