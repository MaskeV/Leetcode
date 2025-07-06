# Write your MySQL query statement below
-- select round(count(distinct player_id)/ (select count(distinct player_id) from Activity),2) as fraction
-- from Activity
-- where (player_id ,date_sub(event_date, interval 1 day))
-- in (select player_id , min(event_date) as firstdate from Activity group by player_id);


-- select round(count(distinct player_id)/(select count(distinct player_id)from Activity),2) as fraction
-- from Activity as A 
-- where datediff(A.event_date,(select min(event_date) from Activity where player_id=A.player_id))=1;


select round(count(distinct A.player_id)/(select count(distinct player_id) from Activity),2) as fraction
from Activity A
where datediff(A.event_date,(select min(event_date) from Activity where player_id=A.player_id))=1;
