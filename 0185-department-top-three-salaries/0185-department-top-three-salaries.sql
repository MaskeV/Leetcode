-- # Write your MySQL query statement below
-- select D.name as Department , E.name as Employee ,Salary
-- from Employee E left join Department D on E.departmentId = D.id
-- where (
--     select count(distinct salary)
--     from Employee E1
--     where E1.departmentId = E.departmentId AND e1.salary >= e.salary
-- )<=3
-- order by departmentId, salary  desc





select D.name as Department , E.name as Employee,salary
from Employee E left join Department D
on E.departmentId = D.id
where
(select count(distinct salary )
from Employee e1
where e1.departmentId=E.departmentId and e1.salary >= E.salary
)<=3
order by departmentId,salary desc 


