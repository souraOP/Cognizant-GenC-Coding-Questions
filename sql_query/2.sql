/*
Write an SQL query to display

The Author Name, city, date of birth and state for authors born before 1st January, 1965 who reside in the state of 'Arizona';

Your output should have 4 columns as given below:

AUTHORNAME  |  CITY  |  DATEOFBIRTH  | STATE

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT
    author_name AS "AUTHORNAME", 
    city AS "CITY",
    date_of_birth AS "DATEOFBIRTH",
    state AS "STATE"
FROM
    authors
WHERE
    date_of_birth < '1965-01-01' 
    AND 
    state = 'Arizona';