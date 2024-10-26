select name
from Employee
where id in (select managerId from Employee where managerId is not NULL group by managerId having count(managerId)>=5);


