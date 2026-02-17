# Write your MySQL query statement below
SELECT p.product_id,IFNULL(ROUND((SUM(p.price*u.units)/SUM(u.units)),2),0) as average_price FROM prices p LEFT JOIN unitssold u 
ON  u.purchase_date>=p.start_date AND u.purchase_date<=p.end_date AND p.product_id = u.product_id
GROUP BY p.product_id;
