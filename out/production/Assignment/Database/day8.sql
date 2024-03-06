select*from Supplier;

insert into Supplier
(supplier_id,supplier_name,supplier_age)
values
(10,"Ajay Devgan",29),
(11,"Simran Kaur",30);

select*from Product;

insert into Product
(product_id,product_name,continued,stock,SupplierID,PostalCode,unit_price)
values
(9,"Product6",true,564,10,501015,134.92),
(10,"Product7",false,128,11,304030,154.39);

select*from Orders;

alter table Orders
add column SupplierId int;

update Orders
set SupplierId = case 
when order_id = 1 then 1
when order_id = 2 then 2
when order_id = 3 then 3
when order_id = 4 then 4
when order_id = 5 then 4
when order_id = 6 then 3
when order_id = 7 then 2
when order_id = 8 then 1
when order_id = 9 then 1
when order_id = 10 then 2
when order_id = 11 then 3
when order_id = 12 then 4
end;

insert into Orders
(order_id,freight_price,ship_country,order_date,NumberOfOrder,RequiredDate,EmployeeID,shippedDate,CustomerID,SupplierID)
values
(13,15,"India","2010-01-02",31,"2010-02-02",7,null,"ALFKI",10),
(14,16,"USA","2010-01-02",31,"2010-02-02",7,null,"ALFKI",11);

update Orders
set EmployeeID=6 where SupplierID=11;

select*from Product;
select*from Orders;

select*from OrderDetails;

insert into OrderDetails
(OrderDetailID,OrderID,ProdutID,UnitPrice,Quantity,Discount)
values
(1005,13,9,134.92,31,2);

alter table OrderDetails
add column OrderDate date;

update OrderDetails
set OrderDate= case
when OrderID=1 then "1996-07-30"
when OrderID=9 then "1995-03-06"
when OrderID=10 then "2000-10-10"
when OrderID=5 then "1996-07-05"
when OrderID=13 then "2010-01-02"
end;

update OrderDetails
set Discount = 3 
where year(OrderDate)= "2010" and monthname(OrderDate)="January";

