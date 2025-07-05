












-- select E.name
-- from Employee E left join Employee M
-- on E.id=M.managerId
-- group by E.id
-- having count(E.id)>=5


select  M.name
from Employee E left join Employee M
on E.managerId=M.id
group by M.id
having count(M.id)>=5







