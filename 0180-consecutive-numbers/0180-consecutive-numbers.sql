# Write your MySQL query statement below
select  distinct L1.num as ConsecutiveNums
from Logs L1 join Logs L2 join Logs L3
on L2.id=L1.id+1 and L3.id=L2.id+1
and L1.num=L2.num and L2.num=L3.num





