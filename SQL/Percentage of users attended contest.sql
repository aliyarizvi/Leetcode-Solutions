select r.contest_id, 
round((count(user_id)*100)/( select count(*) from users),2) as percentage 
from Register r
group by r.contest_id
order by percentage desc, r.contest_id asc
