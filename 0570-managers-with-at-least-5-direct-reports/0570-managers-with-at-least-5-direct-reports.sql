-- select name
-- from Employee
-- where id in (select managerId from Employee where managerId is not NULL group by managerId having count(managerId)>=5);


SELECT e.name
FROM Employee AS e 
INNER JOIN Employee AS m ON e.id=m.managerId 
GROUP BY e.id
HAVING COUNT(e.id) >= 5