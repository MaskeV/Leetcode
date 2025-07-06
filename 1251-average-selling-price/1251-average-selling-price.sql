select P.product_id,ifnull(round(sum(price*units)/sum(units),2),0)as average_price
from Prices P left join UnitsSold U
on P.product_id=U.product_id and start_date<=U.purchase_date and U.purchase_date<=end_date 
group by P.product_id