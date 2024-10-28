/*
Write a SQL query to display:

The account type id and the average account balance for each account type where the average account balance is greater than or equal to 50000.

Your output should have 2 columns:

ACCOUNT_TYPE_ID  |  AVERAGE

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT
    account_type_id AS "ACCOUNT_TYPE_ID",
    AVG(account_balance) AS "AVERAGE"
FROM
    accounts
GROUP BY
    account_type_id
HAVING
    AVG(account_balance) >= 50000;