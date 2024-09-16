/*https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/problem*/

SELECT AVG(population) 
FROM CITY 
WHERE DISTRICT='California' 
GROUP BY DISTRICT
