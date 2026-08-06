# Write your MySQL query statement below
(select num
from MyNumbers
where num in (select num from myNumbers group by num having count(num)=1)
order by num desc
limit 1)
union
(select null as num
from MyNumbers 
where not exists (select num from myNumbers group by num having count(num)=1))
