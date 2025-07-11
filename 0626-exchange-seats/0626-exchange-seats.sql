# Write your MySQL query statement below
-- SELECT id, CASE
--         WHEN id % 2 = 0 THEN LAG(student) over(order by id)
--         when id % 2 = 1  and id!=(SELECT MAX(id) FROM seat) Then LEAD(student) OVER(ORDER BY id)
--         else student
--     END AS student
-- FROM Seat

-- SELECT 
--     CASE 
--         WHEN id = (SELECT MAX(id) FROM seat) AND id % 2 = 1
--             THEN id 
--         WHEN id % 2 = 1
--             THEN id + 1
--         ELSE id - 1
--     END AS id,
--     student
-- FROM seat
-- ORDER BY id 


select 
case
when id=(select max(id) from Seat) and id%2=1
 then id
when id%2=1
 then id+1
else
  id-1
end as id , student
from Seat
order by id;
