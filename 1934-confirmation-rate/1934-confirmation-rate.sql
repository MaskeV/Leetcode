# Write your MySQL query statement below
select S.user_id,round(avg(if(action = 'confirmed',1,0)),2) as confirmation_rate
from Signups S left join Confirmations C
on S.user_id = C.user_id
group by S.user_id;
