/*https://www.hackerrank.com/challenges/earnings-of-employees/problem*/

SELECT TOP 1 MONTHS*SALARY,COUNT(MONTHS*SALARY) 
FROM EMPLOYEE 
GROUP BY MONTHS*SALARY 
ORDER BY MONTHS*SALARY DESC ;
