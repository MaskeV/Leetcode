# Write your MySQL query statement below
#select T1.machine_id,round(avg(T1.timestamp-T2.timestamp),3) as processing_time
#from (select machine_id, timestamp from Activity where activity_type='end') as T1 join (select machine_id, timestamp from Activity where activity_type='start' )as T2
#on T1.machine_id= T2.machine_id 
#group by T1.machine_id ;

-- select A.machine_id ,round(avg(B.timestamp-A.timestamp),3) as processing_time
-- from Activity A join Activity B
-- on A.machine_id=B.machine_id and A.process_id=B.process_id
-- where A.activity_type='start' and B.activity_type='end'
-- group by A.machine_id;









-- select A1. machine_id,round((sum(A2.timestamp)-sum(A1.timestamp))/count(distinct A1. process_id),3) as processing_time
-- from Activity A1 join Activity A2
-- on A1.machine_id = A2.machine_id and A1.process_id = A2.process_id
-- where A1.activity_type= 'start' and A2.activity_type='end'
-- group by A1.machine_id; 

select A.machine_id,round((avg(B.timestamp)-avg(A.timestamp)),3) as processing_time
from Activity A join Activity B
on A.machine_id = B.machine_id
where A.activity_type = 'start' and B.activity_type = 'end'
group by A.machine_id; 













