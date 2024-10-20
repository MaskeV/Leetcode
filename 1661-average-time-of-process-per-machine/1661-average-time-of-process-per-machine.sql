# Write your MySQL query statement below
#select T1.machine_id,round(avg(T1.timestamp-T2.timestamp),3) as processing_time
#from (select machine_id, timestamp from Activity where activity_type='end') as T1 join (select machine_id, timestamp from Activity where activity_type='start' )as T2
#on T1.machine_id= T2.machine_id 
#group by T1.machine_id ;

select a.machine_id, round(avg(a.timestamp-b.timestamp),3) as processing_time
from Activity a join Activity b on a.machine_id=b.machine_id and a.process_id=b.process_id where a.activity_type='end' and b.activity_type ='start' group by machine_id;
