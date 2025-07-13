# Write your MySQL query statement below
select visited_on,(select sum(amount) from Customer 
where visited_on 
between date_sub(C.visited_on,Interval 6 day) and C.visited_on) as amount, 
(select round(sum(amount)/7,2) from Customer
where visited_on
between date_sub(C.visited_on, Interval 6  day) and C.visited_on) as average_amount
from Customer C
where visited_on>= (
select date_add(min(visited_on),Interval 6 day) 
from Customer)
group by visited_on

-- select visited_on,(select sum(amount) from Customer 
-- where visited_on 
-- between date_sub(C.visited_on,Interval 6 day) and C.visited_on) as amount, 
-- (select round(avg(amount),2) from Customer
-- where visited_on
-- between date_sub(C.visited_on, Interval 6  day) and C.visited_on) as average_amount
-- from Customer C
-- where visited_on>= (
-- select date_add(min(visited_on),Interval 6 day) 
-- from Customer)
-- group by visited_on

