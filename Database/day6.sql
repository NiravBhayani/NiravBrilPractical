select upper(product_name) as ProductName from Product;

select product_name,right(product_name,1) as LastCharacter from Product;

alter table Product
add column PostalCode int;

select*from Product;

update Product
set PostalCode = case
when product_id =1 then 200100
when product_id =2 then 200300022
when product_id =3 then 400302010
when product_id =4 then 13872392
when product_id =5 then 123123
when product_id =6 then 1234423
when product_id =7 then 13245321
when product_id =8 then 123456789
end;

select PostalCode,lpad(PostalCode,9,"0") from Product;

alter table Product
drop column unit_price;

alter table Product
add column unit_price long;

update Product
set unit_price = case
when product_id =1 then "200.100"
when product_id =2 then "230.123"
when product_id =3 then "412.54"
when product_id =4 then "138.67"
when product_id =5 then "123.26"
when product_id =6 then "126.93"
when product_id =7 then "132.81"
when product_id =8 then "361.24"
end;

select product_name,cast(unit_price as decimal) as UnitPrice from Product;

select OrderID,floor(sum(UnitPrice*Quantity-(UnitPrice*Quantity*Discount/100))) as FinalPrice from OrderDetails
group by OrderID;

select OrderID,ceiling(sum(UnitPrice*Quantity-(UnitPrice*Quantity*Discount/100))) as FinalPrice from OrderDetails
group by OrderID;

select date_format(order_date,"%Y/%m/%d") from Orders;

select* from Orders
order by order_date desc
limit 5;