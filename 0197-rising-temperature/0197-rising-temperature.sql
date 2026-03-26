select w1.id
from Weather w1 join Weather w2
on w1.recordDate = w2.recordDate+ Interval 1 day
and w1.temperature >w2.temperature












-- select w2.id
-- from Weather W1 join Weather W2
-- on W2.recordDate = date_add(w1.recordDate,interval 1 day)
-- where W2.temperature>W1.temperature