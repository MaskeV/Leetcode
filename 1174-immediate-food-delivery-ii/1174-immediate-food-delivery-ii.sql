# Write your MySQL query statement below
select round(avg(if(order_date=customer_pref_delivery_date,1,0))*100,2) as immediate_percentage
from  Delivery
where (customer_id ,order_date)
in (select customer_id,min(order_date) as first_orderdate
from Delivery
group by customer_id );
# Select where () in () 
# 2*100/4