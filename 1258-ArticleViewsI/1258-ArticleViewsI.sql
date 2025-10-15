-- Last updated: 15/10/2025, 05:57:19
-- Write your PostgreSQL query statement below

SELECT distinct author_id as id
FROM Views
WHERE  author_id = viewer_id
ORDER BY author_id ASC;