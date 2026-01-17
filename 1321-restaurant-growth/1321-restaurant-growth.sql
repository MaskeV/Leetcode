# Write your MySQL query statement below
select c1.visited_on, sum(c2.amount) as amount, round(sum(c2.amount)/7 ,2)as average_amount
from (select visited_on, sum(amount) as amount ,avg(amount) as avg from customer group by visited_On) as  C1 join  (select visited_on, sum(amount) as amount  ,avg(amount) as avg from customer group by visited_on) as C2
on DATEDIFF(c1.visited_on,c2.visited_on) between 0 and 6
group by c1.visited_on
having count(distinct c2.visited_on)=7;

