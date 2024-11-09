# Write your MySQL query statement below
select product_name, sum(unit) as unit
from Products p right join Orders o on p.product_id=o.product_id
where month(order_date)='02' and year(order_date)='2020'
group by p.product_id
having sum(unit)>=100;