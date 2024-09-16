/*https://www.hackerrank.com/challenges/african-cities/problem*/
SELECT CITY.Name 
FROM CITY,COUNTRY 
WHERE CITY.CountryCode  = COUNTRY.Code  
AND COUNTRY.CONTINENT = 'Africa' 
