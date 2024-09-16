/*https://www.hackerrank.com/challenges/weather-observation-station-5/problem
*/

(SELECT CITY,LENGTH(CITY) AS LEN 
FROM STATION ORDER BY LEN, CITY LIMIT 1 )
UNION 
(SELECT CITY,LENGTH(CITY) AS LEN FROM STATION ORDER BY LEN DESC ,CITY LIMIT 1);
