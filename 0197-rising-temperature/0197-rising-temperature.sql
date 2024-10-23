# Write your MySQL query statement 
select N.id
from Weather P join Weather N 
on P.recordDate = N.recordDate- interval '1' day 
where N.temperature > P.temperature 