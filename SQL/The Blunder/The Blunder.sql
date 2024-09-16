/*https://www.hackerrank.com/challenges/the-blunder/problem*/

SELECT CEIL((AVG(SALARY)- AVG(REPLACE(salary,'0','')))) 
FROM EMPLOYEES;
