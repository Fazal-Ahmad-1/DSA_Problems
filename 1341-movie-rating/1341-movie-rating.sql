(select u.name as results
from Users u join MovieRating r on u.user_id=r.user_id
group by r.user_id
order by count(distinct r.movie_id) desc,u.name
limit 1)
UNION ALL
(SELECT m.title as results
FROM Movies m
JOIN MovieRating r ON m.movie_id = r.movie_id
WHERE DATE_FORMAT(r.created_at, '%m-%Y') = '02-2020'
GROUP BY m.movie_id, m.title
ORDER BY AVG(r.rating) DESC, m.title ASC
LIMIT 1)