-- # Write your MySQL query statement below
-- select product_id , new_price as price 
-- from Products 
-- where (product_id,change_date) 
-- in (select product_id, max(change_date) as date from Products where change_date<='2019-08-16'group by product_id)
-- union
-- SELECT product_id, 10 AS price
-- FROM Products
-- GROUP BY product_id
-- HAVING MIN(change_date) > '2019-08-16';





select product_id,new_price as price
from Products
where (product_id,change_date ) in 
(select product_id,max(change_date) 
from Products
where change_date <= '2019-08-16'
group by product_id )
union
select product_id,10 as price 
from Products
group by product_id
having min(change_date)>'2019-08-16'