-- Last updated: 15/10/2025, 05:57:31
-- Write your PostgreSQL query statement below
SELECT product_name, year, price
FROM Sales
LEFT JOIN Product on Sales.product_id = Product.product_id


