# Write your MySQL query statement below
SELECT p.project_id,ROUND(SUM(experience_years)/COUNT(p.project_id),2) as average_years FROM employee e INNER JOIN project  p
ON e.employee_id = p.employee_id
GROUP BY p.project_id;