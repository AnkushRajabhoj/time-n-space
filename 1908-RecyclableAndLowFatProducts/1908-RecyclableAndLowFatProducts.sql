-- Last updated: 15/10/2025, 05:57:03
-- Write your PostgreSQL query statement below

SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';