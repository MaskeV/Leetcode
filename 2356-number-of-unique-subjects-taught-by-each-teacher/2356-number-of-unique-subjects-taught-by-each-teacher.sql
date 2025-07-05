# Write your MySQL query statement below
-- select distinct teacher_id,count(distinct subject_id)as cnt
-- from Teacher
-- group by teacher_id;

-- select teacher_id,count(subject_id) as cnt
-- from (select teacher_id,subject_id from Teacher group by teacher_id,subject_id) as T
-- group by teacher_id;


select teacher_id ,count(distinct subject_id) as cnt
from Teacher
group by teacher_id





