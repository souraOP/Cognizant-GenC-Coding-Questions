/*
Write an SQL Query to display:

The branch ID and the count of accounts handled by each branch ordered in ascending order of branch ID.

Your output should have 2 columns as given below:

BRANCH_ID  |  COUNT

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT
    branch_id, COUNT(*) AS COUNT
FROM
    accounts
GROUP BY
    branch_id
ORDER BY
    branch_id ASC;