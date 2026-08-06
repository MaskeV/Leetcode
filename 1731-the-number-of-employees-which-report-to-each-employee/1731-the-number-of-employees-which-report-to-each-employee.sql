# Write your MySQL query statement below
select M.employee_id, M.name, count(E.employee_id) as reports_count, round(avg(E.age)) as average_age
from Employees E join Employees M
on E.reports_to = M.employee_id
group by M.employee_id
order by M.employee_id

