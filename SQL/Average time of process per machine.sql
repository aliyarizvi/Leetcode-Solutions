select a.machine_id, round(avg(a1.timestamp - a.timestamp),3) as processing_time 
from Activity a
join Activity a1
on a.machine_id =a1.machine_id 
and a.process_id = a1.process_id
and a.timestamp <a1.timestamp 
group by a.machine_id
