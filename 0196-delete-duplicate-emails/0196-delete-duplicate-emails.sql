# Write your MySQL query statement below
delete  p2
from Person P1 join Person P2
on P1.email=p2.email
where p1.id<p2.id
