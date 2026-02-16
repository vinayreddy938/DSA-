# Write your MySQL query statement below
SELECT s.user_id,ROUND(IFNULL(SUM(c.action='confirmed')/COUNT(c.user_id),0),2) as confirmation_rate FROM signups s left JOIN confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id 


