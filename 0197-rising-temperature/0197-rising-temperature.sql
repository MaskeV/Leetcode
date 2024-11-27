# Write your MySQL query statement 
select w2.id
from Weather W1 join Weather W2
on W2.recordDate=W1.recordDate+Interval 1 day
where W2.temperature>W1.temperature;