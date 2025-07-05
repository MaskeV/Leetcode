












-- select E.name
-- from Employee E left join Employee M
-- on E.id=M.managerId
-- group by E.id
-- having count(E.id)>=5


-- select  M.name
-- from Employee E left join Employee M
-- on E.managerId=M.id
-- group by M.id
-- having count(M.id)>=5


-- select name
-- from Employee
-- where id in (select managerId from Employee  group by managerId having count(managerId)>=5);


SELECT e.name
FROM Employee e  JOIN Employee m 
ON e.id=m.managerId 
GROUP BY e.id
HAVING COUNT(e.id) >= 5







