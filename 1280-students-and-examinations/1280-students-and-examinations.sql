# Write your MySQL query statement below
-- select S.student_id,S.student_name,Su.subject_name, count(E.student_id)as attended_exams
-- from Students S cross join Subjects Su
-- left join Examinations E 
-- on S.student_id=E.student_id and Su. Subject_name = E.subject_name
-- group by S.student_id , Su.subject_name
-- order by S.student_id, Su.subject_name;























select S.student_id,student_name, Su.subject_name , count(E.subject_name) as attended_exams
from (Students S cross join Subjects Su)  left join Examinations E 
on Su.subject_name = E.subject_name and S.student_id = E.student_id
group by S.student_id, Su. subject_name
order by S.student_id,Su.subject_name;