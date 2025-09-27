-- select 'Low Salary' as category,count(account_id) as accounts_count
-- from Accounts
-- where income<20000

-- union

-- select 'Average Salary' as category,count(account_id) as accounts_count
-- from Accounts
-- where income>=20000 and income<=50000

-- union 

-- select "High Salary" as category,count(account_id) as accounts_count
-- from Accounts
-- where income>50000











Select 'Low Salary' as category, count(account_id) as accounts_count
from Accounts 
where income<20000

union

Select 'Average Salary' as category, count(account_id) as accounts_count
from Accounts 
where income>=20000 and income<=50000

union

Select 'High Salary' as category, count(account_id) as accounts_count
from Accounts 
where income>50000
