/*https://www.hackerrank.com/challenges/weather-observation-station-18/problem*/

SELECT (round( ABS(MIN(LAT_N)- MAX(LAT_N)) + ABS( MIN(LONG_W) -  MAX(LONG_W)),4)) 
FROM STATION 
