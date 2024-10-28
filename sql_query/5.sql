/*
Write an SQL Query to display:

The first name, contact number and balance of all the customer whose account type starts with "Sa". 
The output should be ordered by the customer's first name.

Your output should have 2 columns as given below:

FIRST_NAME  |  CONTACT  |  BALANCE

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT
    c.first_name AS "FIRST_NAME",
    c.contact_number AS "CONTACT",
    c.balance AS "BALANCE"
FROM
    customers c
JOIN
    accounts a ON c.customer_id = a.customer_id
WHERE
    a.account_type LIKE 'Sa%'
ORDER BY
    c.first_name;
