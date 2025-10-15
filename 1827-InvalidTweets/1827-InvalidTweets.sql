-- Last updated: 15/10/2025, 05:57:06
-- Write your PostgreSQL query statement below


SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;