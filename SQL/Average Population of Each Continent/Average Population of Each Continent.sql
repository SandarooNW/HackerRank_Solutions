/*https://www.hackerrank.com/challenges/average-population-of-each-continent/problem*/
SELECT COUNTRY.Continent, FLOOR(AVG(CITY.Population)) 
FROM CITY,COUNTRY 
WHERE CITY.CountryCode = COUNTRY.Code  
GROUP BY COUNTRY.Continent 
