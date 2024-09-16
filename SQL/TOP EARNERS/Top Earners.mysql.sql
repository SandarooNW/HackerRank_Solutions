
/*
total earnings = monthly salary*months worked
maximum total earnings to be the maximum total earnings for any employee in the Employee table
 Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. 
Then print these values as 2  space-separated integers. 
MS SQL Sever answer
*/

SELECT TOP 1 MONTHS*SALARY,COUNT(MONTHS*SALARY) FROM EMPLOYEE GROUP BY MONTHS*SALARY ORDER BY MONTHS*SALARY DESC ;
