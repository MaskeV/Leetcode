












select distinct E.name
from Employee E left join Employee M
on E.id=M.managerId
group by E.id
having count(E.id)>=5











