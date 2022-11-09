# Write your MySQL query statement below
Select name from Salesperson where sales_id NOT IN ((Select sales_id from orders where com_id not in (Select com_id from company where name != "RED")));