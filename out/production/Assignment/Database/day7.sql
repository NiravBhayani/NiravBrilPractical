select*from Employee;

select*from Customers;

update Customers
set City = "India" 
where City="London";

update Customers
set City = case
when OrderID =1 then "Berlin"
when OrderID =2 then "Berlin"
when OrderID =3 then "Surat"
when OrderID =5 then "Berlin"
when OrderID =8 then "Ahmedabad"
when OrderID =9 then "Surat"
end;

alter table Customers
add column Country varchar(10);

update Customers
set Country = case
when City ="Berlin" then "Germany"
when City in("Surat","Ahmedabad") then "India"
end;

alter table Employee
add column Address varchar(25);

update Employee
set Address = case
when id =1 then "Nehru Nagar"
when id =2 then "Navrangpura"
when id =3 then "Main Street"
when id =4 then "Manek Baug"
when id =5 then "Gota Cross Road"
when id =6 then "Sciencity"
when id =7 then "Kalol"
end;

alter table Employee
add column PostalCode int;

update Employee
set PostalCode = case
when id =1 then 383315
when id =2 then 394150
when id =3 then 394190
when id =4 then 362020
when id =5 then 372812
when id =6 then 912849
when id =7 then 149203
end;

alter table Employee
add column Phone long;

update Employee
set Phone = case
when id =1 then 9999999999
when id =2 then 8888888888
when id =3 then 7777777777
when id =4 then 6666666666
when id =5 then 5555555555
when id =6 then 4444444444
when id =7 then 3333333333
end;

alter table Employee
add column Country varchar(10);

update Employee
set city = case
when id =1 then "Berlin"
when id =2 then "Surat"
when id =3 then "Berlin"
when id =4 then "London"
when id =5 then "Berlin"
when id =6 then "Delhi"
when id =7 then "London"
end;

update Employee
set Country = case
when City ="Berlin" then "Germany"
when City in("Surat","Ahmedabad","Delhi") then "India"
when City="London" then "England"
end;

update Employee
set city = "India" where id in ("2","7");

alter table Customers
add column Address varchar(25);

update Customers
set Address = case
when OrderID =1 then "Nehru Nagar"
when OrderID =2 then "Main Street"
when OrderID =3 then "Navrangpura"
when OrderID =5 then "Gota Cross Road"
when OrderID =8 then "Sciencity 2"
when OrderID =9 then "Kalol 2"
end;

alter table Customers
add column PostalCode int;

update Customers
set PostalCode = case
when OrderID =1 then 383315
when OrderID =2 then 394190
when OrderID =3 then 394150
when OrderID =5 then 372812
when OrderID =8 then 192849
when OrderID =9 then 419203
end;

alter table Customers
add column Phone long;

update Customers
set Phone = case
when OrderID =1 then 9999999999
when OrderID =2 then 7777777777
when OrderID =3 then 8888888888
when OrderID =5 then 5555555555
when OrderID =8 then 2222222222
when OrderID =9 then 1111111111
end;

alter table Customers
add column Region varchar(10);

update Customers
set Region = case
when OrderID =1 then "WA"
when OrderID =2 then "WA"
when OrderID =3 then "LA"
when OrderID =5 then "LA"
when OrderID =8 then "WA"
when OrderID =9 then "LA"
end;

insert into Customers
(CustomerID,CustomerName,OrderID,OrderDate,RequiredDate,City,Country,Address,PostalCode,Phone,Region)
values
("RATTC","Amrita Sanghani",11,"1997-02-12","1997-03-12","Delhi","India","Manek chok",392193,1010101010,"WA");


select concat(first_name," ",last_name) as FullName,Address,city as City,region as Region,PostalCode,Country,Phone
from Employee
where substring(first_name,1,1)="a"
union select CustomerName as FullName,Address,City,Region,PostalCode,Country,Phone 
from Customers
where substring(CustomerName,1,1)="a";

select concat(first_name," ",last_name) as FullName,Address,city as City,region as Region,PostalCode,Country,Phone
from Employee
where Country ="India"
union select CustomerName as FullName,Address,City,Region,PostalCode,Country,Phone 
from Customers
where Country ="India";