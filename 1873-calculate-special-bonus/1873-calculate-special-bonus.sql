# Write your MySQL query statement below

select employee_id , 
case 
when employee_id % 2 != 0 and name not like 'M%' then salary
when  employee_id % 2 = 0 or name like 'M%' then 0
End as bonus
from Employees
order by employee_id

