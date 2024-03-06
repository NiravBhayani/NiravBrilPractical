select*from Orders;

alter table Orders
add column EmployeeID int;

alter table Orders
add column CustomerID varchar(10);

update Orders
set EmployeeID = case
when order_id =1 then 2
when order_id =2 then 3
when order_id =3 then 4
when order_id =4 then 5
when order_id =5 then 6
when order_id =6 then 7
when order_id =7 then 2
when order_id =8 then 1
when order_id =9 then 3
end;

update Orders
set CustomerID = case
when order_id =1 then "ALFKI"
when order_id =2 then "ALFKI"
when order_id =3 then "ALFKI"
when order_id =4 then "RATTC"
when order_id =5 then "ALFKI"
when order_id =6 then "BONAP"
when order_id =7 then "RICSU"
when order_id =8 then "ALFKI"
when order_id =9 then "ALFKI"
when order_id =10 then "SIMOB"
when order_id =11 then "RATTC"
when order_id =12 then "BONAP"

end;

alter table Orders
add column ShippedDate date;

update Orders
set ShippedDate = case
when order_date ="1996-7-30"then "1996-8-12"
when order_date ="1997-6-01" then "1997-6-12"
when order_date ="1996-8-20" then "1996-8-26"
when order_date ="1996-7-05" then "1996-7-15"
when order_date ="1999-7-17" then "1999-7-30"
when order_date ="1996-7-10" then "1996-7-20"
when order_date ="1991-8-05" then "1991-8-23"
when order_date ="1993-12-12" then "1993-12-25"
when order_date ="1995-03-06" then "1995-3-14"
end;

insert into Orders
(order_id,freight_price,ship_country,order_date,NumberOfOrder,RequiredDate,EmployeeID,ShippedDate)
values
(10,230,"Africa","2000-10-10",32,"2000-11-10",6,null),
(11,152,"USA","2000-10-10",12,"2000-11-10",7,null),
(12,92,"Netherland","2000-10-10",69,"2000-11-10",2,null);

select*from Orders
where order_date=(select max(order_date)from Orders);


create table OrderDetails(
OrderDetailID int primary key,
OrderID int,
ProdutID int,
UnitPrice float,
Quantity int,
Discount float
);

select*from Orders;
select*from Customers;
select*from Product;
select*from OrderDetails;

insert into OrderDetails
(OrderDetailID,OrderID,ProdutID,UnitPrice,Quantity,Discount)
values
(1001,1,2,230.123,2,0.1),
(1002,9,7,132.81,3,0.3),
(1003,10,1,200.100,1,0),
(1004,5,9,134.92,6,0.5);

update OrderDetails
set Discount = 3 where Discount = "0.3";

select c.CustomerID,o.order_id,c.CustomerName,max(od.UnitPrice*od.Quantity-(od.UnitPrice*od.Quantity*od.Discount/100)) as MostExpensiveItemValue
from Customers c
join Orders o on c.OrderID = o.order_id
join OrderDetails od on o.order_id=od.OrderID
group by c.CustomerID,c.CustomerName,o.order_id;


create table Employee_Temp(
first_name varchar(50),
last_name varchar(50)
);

insert into Employee_Temp (first_name,last_name)
select first_name,last_name
from Employee;

select* from Employee_Temp;