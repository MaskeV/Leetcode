# Write your MySQL query statement below
-- SELECT 
--     DATE_FORMAT(trans_date, "%Y-%m") AS month,
--     country,
--     COUNT(id) AS trans_count,
--     sum(state='approved') AS approved_count,
--     SUM(Transactions.amount) AS trans_total_amount,
--     SUM(IF(Transactions.state = 'approved', Transactions.amount, 0)) AS approved_total_amount
-- FROM 
--     Transactions
-- GROUP BY 
--     country, month;



select 
date_format(trans_date, "%Y-%m") as month, 
country,
count(id) as trans_count,
sum(if(state='approved',1,0))as approved_count,
sum(amount) as trans_total_amount,
sum(if(state='approved',amount,0))approved_total_amount
from Transactions
group by country,month







