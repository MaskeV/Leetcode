# Write your MySQL query statement below



select product_name ,sum(unit) as unit
from Products P join Orders O
on P.product_id= o.product_id
where month(order_date)='02' and year(order_date)='2020'
group by P.product_id
having sum(unit)>=100