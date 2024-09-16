/*https://www.hackerrank.com/challenges/the-pads/problem*/

SELECT concat(Name,'(',SUBSTRING(Occupation,1,1),')') FROM OCCUPATIONS ORDER BY Name  ;
SELECT concat('There are a total of ',count(Occupation),' ',Lower(Occupation),'s','.')
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY count(Occupation) ;
