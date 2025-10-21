# Write your MySQL query statement below
select name 
from SalesPerson
where name not in (select S.name
from Orders O join Company C join SalesPerson S
on O.com_id=C.com_id and S.sales_id=O.sales_id
where C.name = "RED")