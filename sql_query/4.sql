/*
Write an SQL Query to display:

The transaction ID, transaction amount and transaction type of all the transactions whose transaction type is "Debit" and transaction amount is greater than 10000 and less than 50000.

Your output should have 3 columns as given below:

TRANSACTION_ID  |  AMOUNT  |  TRANSACTION_TYPE

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the right-hand side of the screen.

*/

SELECT
    transaction_id AS "TRANSACTION_ID",
    amount AS "AMOUNT",
    transaction_type AS "TRANSACTION_TYPE"
FROM
    transactions
WHERE
    transaction_type = 'Debit' 
    AND 
    amount > 10000
    AND
    amount < 50000;