# Write your MySQL query statement below
select distinct table1.num as ConsecutiveNums
from Logs table1,
Logs table2,
Logs table3
where table2.id= table1.id+1 and table3.id=table2.id+1
and table1.num=table2.num and table2.num=table3.num;









-- select distinct L1.num as consecutiveNums 
-- from Logs L1 join Logs L2 join Logs L3
-- on L2.id=L1.id+1 and L3.id=L2.id+1
-- where L1.num=L2.num and L2.num=L3.num 




