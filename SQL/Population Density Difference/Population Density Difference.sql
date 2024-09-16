/*https://www.hackerrank.com/challenges/population-density-difference/problem*/

SELECT (max(population) - min(population))
FROM CITY
