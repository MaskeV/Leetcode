


select product_id,year as first_year, quantity, price
from Sales
where( year) in (select   min(year) from Sales group by product_id)