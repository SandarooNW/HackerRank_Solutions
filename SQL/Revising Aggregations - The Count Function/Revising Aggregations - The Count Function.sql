/*https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem*/

SELECT count(CITY.ID) 
FROM CITY 
WHERE CITY.POPULATION >100000
