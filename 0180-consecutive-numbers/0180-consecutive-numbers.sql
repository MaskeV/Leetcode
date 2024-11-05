# Write your MySQL query statement below
select distinct table1.num as ConsecutiveNums
from Logs table1,
Logs table2,
Logs table3
where table1.id= table2.id-1 and table2.id=table3.id-1
and table1.num=table2.num and table2.num=table3.num;