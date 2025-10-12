# Write your MySQL query statement below
-- select name as results
-- from Users U join MovieRating M
-- using(user_id)
-- group by user_id
-- order by count(rating) desc , name asc 
-- limit 1
-- union all
-- select title as results
-- from Movies M join MovieRating Mr
-- using(movie_id)
-- where month(created_at)='02' and year(created_at)='2020'
-- group by movie_id
-- order by avg(rating) desc , title asc 
-- limit 1


(select name as results
from Users u join MovieRating M 
on U.user_id=M.user_id
group by M.user_id
order by count(M.user_id) desc,name
limit 1)

Union all

(select title
from Movies M join MovieRating MR
on M.movie_id = MR.movie_id
where created_at between '2020-02-01' and '2020-02-29'
group by M.movie_id
order by avg(rating) desc,title
limit 1)
