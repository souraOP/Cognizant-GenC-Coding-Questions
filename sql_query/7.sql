/*
Write an SQL Query to display:

The number of passengers in each flight. Display the result in ascending order of flight id.

Note: Do not display flights with no passengers.

Your output should have two columns as given below:

FLIGHT_ID  |  NUMBER_OF_PASSENGERS

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT
    f.FLIGHT_ID, COUNT(p.PASSENGER_ID) AS NUMBER_OF_PASSENGERS
FROM
    flights f
JOIN
    passengers p ON f.FLIGHT_ID = p.FLIGHT_ID
GROUP BY
    f.FLIGHT_ID
HAVING
    COUNT(p.PASSENGER_ID) > 0
ORDER BY
    f.FLIGHT_ID ASC;