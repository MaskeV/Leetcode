# Write your MySQL query statement below
select user_id as  buyer_id,join_date,count(item_id) as orders_in_2019 
from Users U left JOIN Orders O
ON U.user_id = O.buyer_id
and year(order_date) = '2019' 
group by user_id 





