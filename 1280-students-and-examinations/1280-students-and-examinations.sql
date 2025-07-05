select S.student_id,student_name,Su.subject_name,count(Ex.subject_name) as attended_exams
from (Students S cross join Subjects Su)  left join Examinations Ex
on S.student_id=Ex.student_id and Su.subject_name=Ex.subject_name
group by S.student_id, Su.subject_name
order by S.student_id,Su.subject_name




















-- select S.student_id,student_name, Su.subject_name , count(E.subject_name) as attended_exams
-- from (Students S cross join Subjects Su)  left join Examinations E 
-- on Su.subject_name = E.subject_name and S.student_id = E.student_id
-- group by S.student_id, Su. subject_name
-- order by S.student_id,Su.subject_name;