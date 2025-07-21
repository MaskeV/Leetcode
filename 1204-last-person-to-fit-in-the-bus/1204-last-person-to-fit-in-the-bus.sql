-- SELECT q1.person_name
-- FROM Queue q1 JOIN Queue q2 
-- ON q1.turn >= q2.turn
-- group by q1.turn
-- having sum(q2.weight)<=1000
-- order by sum(q2.weight) desc
-- limit 1


select person_name
from(
    select person_name,weight , turn,
    sum(weight) over (order by turn) as total_weight  from Queue
) as subquerry where total_weight <= 1000
order by turn desc
limit 1

