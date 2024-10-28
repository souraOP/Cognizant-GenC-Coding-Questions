/*
Write an SQL query to display

The Student ID, first name, last name of students enrolled in a course held in room 'R1'. 
Use alias 'Student ID', 'First Name', 'Last Name'.

Your output should have 3 columns:

STUDENT ID  |  FIRST NAME  |  LAST NAME

You can view the database schema by clicking the View Schema tab at the bottom of the query window on the 
right-hand side of the screen.

*/

SELECT 
    s.student_id AS "Student ID", 
    s.first_name AS "FIRST NAME", 
    s.last_name AS "LAST NAME"
FROM 
    students s
JOIN 
    enrollments e ON s.student_id = e.student_id
JOIN 
    courses c ON e.course_id = c.course_id
WHERE 
    c.room = 'R1';

