# Write your MySQL query statement below
select P.product_id ,round(ifnull(sum(P.price*U.units)/nullif(sum(units),0),0),2) as average_price
from Prices P left join UnitsSold U on P.product_id=u.product_id
and P.start_date<= U.purchase_date and P.end_date >= U.purchase_date
group by P.product_id;
# (100*5+15*20)/115