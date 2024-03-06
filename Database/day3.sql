select*from Employee
order by first_name;

select*from Employee
order by first_name,last_name;

select product_name,unit_price from Product
order by unit_price desc;




select count(*) as no_of_salesRepresentative from Employee
where job_title = "Sales Representative";

alter table Employee
add column department varchar(10);

update Employee
set department ="Management"
where job_title="Sales Manager";

update Employee
set department ="Marketing"
where job_title="Sales Marketing";

update Employee
set department ="Represent"
where job_title="Sales Representative";

select*from Employee;

select department, count(*) as total_employees from Employee
group by department;

select distinct department from Employee;

select count(id) as TotalEmployee from Employee;


select*from Product
order by unit_price desc
limit 1;

select*from Product
where unit_price = (select max(unit_price) from Product);

alter table Product
add column stock int;

update Product
set stock = case
when product_name ="biscuit" then 5000
when product_name ="waffer" then 2000
when product_name ="panipuri" then 1000
when product_name ="khakhra" then 100
end;

select*from Product;

select*from Product
where stock = (select min(stock)from Product);

select*from Product
order by stock
limit 1;

select*from Orders;

alter table Orders
add column freight_price int;

update Orders
set freight_price = case
when order_name ="Pav Bhaji" then 200
when order_name ="Manchuriyan" then 120
when order_name ="Chole" then 60
when order_name ="Panipuri" then 30
when order_name ="Vada Pav" then 50
when order_name ="Dabeli" then 40
when order_name ="Kachori" then 60
end;

alter table Orders
add column ship_country varchar(20);

update Orders
set ship_country = case
when order_name ="Pav Bhaji" then "USA"
when order_name ="Manchuriyan" then "China"
when order_name ="Chole" then "USA"
when order_name ="Panipuri" then "Pakistan"
when order_name ="Vada Pav" then "Berlin"
when order_name ="Dabeli" then "Netherland"
when order_name ="Kachori" then "Africa"
when order_name ="Jumbo Vada Pav" then "Berlin"
when order_name ="Pizza" then "Turkis"            
end;

select ship_country,avg(freight_price) as avg_freight_price from Orders
where ship_country = "USA"
group by ship_country;

alter table Orders
add column order_date date;

update Orders
set order_date = case
when order_name ="Pav Bhaji" then "1996-7-30"
when order_name ="Manchuriyan" then "1997-6-01"
when order_name ="Chole" then "1996-8-20"
when order_name ="Panipuri" then "1996-7-05"
when order_name ="Vada Pav" then "1999-7-17"
when order_name ="Dabeli" then "1996-7-10"
when order_name ="Kachori" then "1991-8-05"
when order_name ="Jumbo Vada Pav" then "1993-12-12"
when order_name ="Pizza" then "1995-3-06"
end;

select sum(freight_price) as sum_freight_price from Orders
where year(order_date)="1996" and monthname(order_date)="july";

