/*
The flight ID and the name of the pilot(s) for all flights departing from 'Dubai' where the pilots have designation 'Captain'. The pilot's name should be displayed by joining FIRST_NAME and LAST_NAME with a space.

Your output should have two columns as given below:

FLIGHT_ID  |   Pilot_Name


You can view the database schema by clicking the View Schema tab at the bottom of the query window on the right-hand side of the screen.

*/

SELECT 
    f.FLIGHT_ID, CONCAT(p.FIRST_NAME, ' ', p.LAST_NAME) AS Pilot_Name
FROM
    Flights f
JOIN
    PilotAssignments pa ON f.FLIGHT_ID = pa.FLIGHT_ID
JOIN
    Pilots p on pa.PILOT_ID = p.PILOT_ID
WHERE
    f.DEPARTURE_CITY = 'Dubai' AND
    p.DESIGNATION = 'Captain';


