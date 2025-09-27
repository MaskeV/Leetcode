select E2.employee_id,E2.name,count(E1.employee_id) as reports_count,round(avg(E1.age),0) as average_age 
from Employees E1 join Employees E2
on E1.reports_to=E2.employee_id
group by E2.employee_id
order by e2.employee_id

