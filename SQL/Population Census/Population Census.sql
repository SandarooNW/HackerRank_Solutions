/*https://www.hackerrank.com/challenges/asian-population/problem*/

SELECT SUM(CITY.POPULATION) 
FROM CITY,COUNTRY 
WHERE COUNTRY.CONTINENT = 'Asia' AND CITY.CountryCode=COUNTRY.Code 
