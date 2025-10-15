-- Last updated: 15/10/2025, 05:57:07
-- Write your PostgreSQL query statement below
SELECT customer_id, count(customer_id) as count_no_trans
FROM Visits
WHERE visit_id NOT IN (SELECT visit_id FROM Transactions)
GROUP BY customer_id