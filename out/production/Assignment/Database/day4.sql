select*from Employee;

select*from Orders;

alter table Orders
add column NumberOfOrder int;

update Orders
set NumberOfOrder = case
when order_name ="Pav Bhaji" then 123
when order_name ="Manchuriyan" then 96
when order_name ="Chole" then 127
when order_name ="Panipuri" then 156
end;

insert into Orders
(order_id,order_name,freight_price,ship_country,NumberOfOrder)
values
(8,"Jumbo Vada Pav",90,104),
(9,"Pizza",250,43);

select e.id,e.first_name,o.NumberOfOrder from Employee as e
inner join Orders as o
on e.id = o.order_id;

alter table Orders
add column RequiredDate date;

update Orders
set RequiredDate = case
when order_date ="1996-7-30"then "1996-8-30"
when order_date ="1997-6-01" then "1997-7-01"
when order_date ="1996-8-20" then "1996-9-20"
when order_date ="1996-7-05" then "1996-8-05"
when order_date ="1999-7-17" then "1999-8-17"
when order_date ="1996-7-10" then "1996-8-10"
when order_date  = "1991-8-05" then "1991-9-05"
when order_date ="1993-12-12" then "1994-1-12"
when order_date ="1995-3-06" then "1995-4-06"
end;

create table Customers(
CustomerID varchar(20),
CustomerName varchar(20),
OrderID int primary key,
OrderDate date,
RequiredDate date,
City varchar(10)
);

insert into Customers
(CustomerID,CustomerName,OrderID,OrderDate,RequiredDate,City)
values
("ALFKI","Nirav Bhayani",1,"1996-7-30","1996-8-30","Berlin"),
("ALFKI","Nirav Limbani",3,"1996-8-20","1996-9-20","London"),
("ALFKI","Om Makani",5,"1999-7-17","1999-8-17","Berlin"),
("ALFKI","Dipika Padukon",8,"1993-12-12","1994-1-12","China"),
("ALFKI","Nisha Bharucha",2,"1997-6-01","1997-7-01","Berlin"),
("ALFKI","Videsh Makvana",9,"1995-3-06","1995-4-06","London");

create table Shippers(
OrderID int primary key,
ShippedDate date,
Shipvia_SpeedyExpress boolean,
ShipName varchar(20),
ShipAddress varchar(30),
ShipCity varchar(20)
);

insert into Shippers
(OrderID,ShippedDate,Shipvia_SpeedyExpress,ShipName,ShipAddress,ShipCity)
values
(1,"1996-8-12",true,"Alfreds Futterki","Obere Str.57","Berlin"),
(2,"1997-6-12",false,"Alfreds Futterki","Obere Str.57","Berlin"),
(3,"1996-8-26",true,"Alfreds Futterki","Obere Str.57","London"),
(5,"1999-7-30",true,"Alfreds Futterki","Obere Str.57","Berlin"),
(8,"1993-12-25",true,"Alfreds Futterki","Obere Str.57","China"),
(9,"1995-3-14",false,"Alfreds Futterki","Obere Str.57","London");

select o.order_id,c.CustomerID,c.OrderDate,c.RequiredDate,s.ShippedDate,s.Shipvia_SpeedyExpress,o.freight_price,s.ShipAddress,s.ShipName,s.ShipCity
from Orders as o
inner join Customers as c
on o.order_id = c.OrderID
inner join Shippers as s
on o.order_id = s.OrderID
where s.Shipvia_SpeedyExpress is true and s.ShipCity="Berlin";

select *from Product;

alter table Product
add column SupplierID int;

update Product
set SupplierId = case
when product_name ="waffer" then 1
when product_name ="biscuit" then 2
when product_name ="panipuri" then 1
when product_name ="khakhra" then 3
end;

insert into Product
(product_id,product_name,unit_price,continued,stock,SupplierID)
values
(5,"Product5",120,true,200,2),
(6,"Product1",130,true,1000,4),
(7,"Product2",140,false,2000,1),
(8,"Product3",150,false,5000,1);

select s.supplier_name, count(p.product_id) as ProductCount
from Supplier s
left outer join Product p on s.supplier_id = p.SupplierID
group by s.supplier_id, s.supplier_name
order by s.supplier_id desc;

select*from Employee;

alter table Employee
add column boss_id int;

update Employee
set boss_id = case
when id = 4 then 1
when id = 2 then 3
when id = 3 then 3
end;
 
select t1.first_name as EmployeeName,t2.first_name as BossName
from Employee as t1
join Employee as t2
on t2.id = t1.boss_id;

