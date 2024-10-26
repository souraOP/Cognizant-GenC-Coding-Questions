/*
Mike is given an integer number N, he is asked to find out all those numbers within this range of 1 to N (inclusive), which are:

- Either Square of any number or,
- Cube of any number

Find and return the sum of the highest square and the highest cube in the range of 1 to N (inclusive)

Input Specification:
input1: An integer value N

Output Specification: 
Return an integer value representing the sum of the highest square and the highest cube.

Example: 

input: 10
output: 17
*/

import java.util.*;

public class exam_MikesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int highestSquareRoot = (int)(Math.floor(Math.sqrt(n)));
        int highestSquare = highestSquareRoot * highestSquareRoot;

        int highestCubicRoot = (int)(Math.floor(Math.cbrt(n)));
        int highestCube = highestCubicRoot * highestCubicRoot * highestCubicRoot;

        System.out.println(highestCube + highestSquare);
        sc.close();
    }
}