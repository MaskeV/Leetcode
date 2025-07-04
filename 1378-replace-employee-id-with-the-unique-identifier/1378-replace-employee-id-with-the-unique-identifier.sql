select unique_id,name
from Employees EU left join EmployeeUNI EUN
on EU.id=EUN.id
