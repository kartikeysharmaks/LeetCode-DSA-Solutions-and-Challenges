# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login from Activity GROUP by player_id