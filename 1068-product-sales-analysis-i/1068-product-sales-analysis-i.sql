# Write your MySQL query statement below
select product_name,year,price
from Sales s left join Product P
on s.product_id=p.product_id
