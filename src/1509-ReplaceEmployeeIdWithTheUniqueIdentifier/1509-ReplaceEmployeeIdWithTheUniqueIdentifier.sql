-- Last updated: 15/10/2025, 05:57:10
-- Write your PostgreSQL query statement below
SELECT unique_id, name
FROM Employees 
LEFT JOIN EmployeeUNI on Employees.id = EmployeeUNI.id
 