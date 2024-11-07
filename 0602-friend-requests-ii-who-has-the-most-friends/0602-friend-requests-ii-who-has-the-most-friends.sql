# Write your MySQL query statement below
select requester_id as id, count(requester_id) as num
from
(select requester_id from RequestAccepted 
Union all
Select accepter_id  from RequestAccepted) as T
group by requester_id
order by count(requester_id ) desc
limit 1;
