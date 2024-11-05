# Write your MySQL query statement below
select E.employee_id,E.name,count(E1.employee_id) as reports_count, round(avg(E1.age))as average_age
from Employees E inner join Employees E1
on E.employee_id =E1.reports_to
group by E.employee_id
order by employee_id;