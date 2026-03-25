# Write your MySQL query statement belo
select D.name as Department ,E.name as Employee,salary as salary
from Employee E join Department D
on E.departmentId = D.id 
where (D.id,salary)  in  (select D.id,max(salary)
from Employee E join Department D
on E.departmentId = D.id 
group by D.id)
