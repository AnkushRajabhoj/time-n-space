-- Last updated: 15/10/2025, 05:58:17
-- Write your PostgreSQL query statement below


SELECT name
FROM Customer
WHERE referee_id IS NULL OR referee_id != 2;