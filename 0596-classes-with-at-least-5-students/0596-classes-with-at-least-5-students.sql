# Write your MySQL query statement below
-- SELECT class
-- FROM Courses
-- GROUP BY class
-- having count(student)>=5;


-- select class
-- from (select class,count(student) as  count from Courses group by class) as T
-- where count>=5;






select class
from Courses
group by class
having count(student)>=5