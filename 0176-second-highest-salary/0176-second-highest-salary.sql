# Write your MySQL query statement below
-- (select salary as SecondHighestSalary
-- from Employee
-- where salary != (select max(salary) from employee) 
-- order by salary desc
-- limit 1)
-- union
-- (SELECT NULL AS SecondHighestSalary
-- FROM Employee
-- HAVING COUNT(distinct salary) <= 1)


select max(salary) as SecondHighestSalary
from Employee
where salary<(select max(salary) from Employee);