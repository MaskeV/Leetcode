# Write your MySQL query statement below
SELECT 
    DATE_FORMAT(trans_date, "%Y-%m") AS month,
    country,
    COUNT(id) AS trans_count,
    SUM(Transactions.state = 'approved') AS approved_count,
    SUM(Transactions.amount) AS trans_total_amount,
    SUM(IF(Transactions.state = 'approved', Transactions.amount, 0)) AS approved_total_amount
FROM 
    Transactions
GROUP BY 
    country, month;
