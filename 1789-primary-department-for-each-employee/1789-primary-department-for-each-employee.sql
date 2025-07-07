-- # Write your MySQL query statement below
-- select employee_id, department_id
-- from employee
-- group by employee_id
-- having count(employee_id)=1

-- union

-- select employee_id, department_id
-- from Employee
-- where primary_flag = 'Y';



select employee_id, department_id
from Employee
where primary_flag='Y' or 
employee_id in
 (select employee_id 
 from Employee
 group by employee_id 
 having count(employee_id)=1 );



-- select employee_id,if(count(department_id)=1,department_id,(select department_id from Employee where employee_id=E.employee_id and primary_flag='Y')) as department_id
-- from Employee E
-- group by employee_id;

-- select employee_id,department_id
-- from Employee 
-- where (employee_id,department_id) in (select employee_id,department_id from Employee  group by employee_id 
-- having  primary_flag='y'or count(department_id)=1 )
