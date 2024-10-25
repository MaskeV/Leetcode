# Write your MySQL query statement below
select s.user_id,round(avg(case when c.action='confirmed' then 1 else 0 end ),2) as confirmation_rate
from SignUps S left join Confirmations C on S.user_id= C.user_id
group by s.user_id;
