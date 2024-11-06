# Write your MySQL query statement below
(select name as results
from Users U join MovieRating M
using(user_id)
group by user_id
order by count(rating) desc , name asc 
limit 1)
union
(select title as results
from Movies M join MovieRating Mr
using(movie_id)
where month(created_at)='02' and year(created_at)='2020'
group by movie_id
order by avg(rating) desc , title asc 
limit 1);
