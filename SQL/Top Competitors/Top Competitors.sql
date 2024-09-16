/*https://www.hackerrank.com/challenges/full-score/problem*/

SELECT h.hacker_id , h.name
FROM hackers h
INNER JOIN Submissions s on h.hacker_id = s.hacker_id
INNER JOIN challenges c on c.challenge_id = s.challenge_id
INNER JOIN difficulty d on d.difficulty_level = c.difficulty_level

WHERE d.Score= s.Score 

Group By h.hacker_id , h.name
HAVING COUNT(s.challenge_id) >1
ORDER BY COUNT(s.challenge_id) DESC, h.hacker_id ASC
