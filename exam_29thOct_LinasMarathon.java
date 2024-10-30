/*
Lina is preparing for a marathon and tracks her pace (in minutes per kilometer) at regular intervals during her 
practice run. Her coach is con interested in knowing how many times Lina's pace exceeds a specified threshold T. 
Your task is to find and return an integer value representing the count of how many pace readings are 
greater than the threshold.

Input Specification:

input1: An integer value representing the number of pace readings.

input2: An integer value T representing the maximum allowable pace threshold.

input3: An integer array representing Lina's pace reading at each interval.

Output Specification:

Return an integer representing the count of how many pace readings are greater than the threshold.

Example 1:

input1: 5

Input2: 7

input3: (6,8,5,10,7}

Output: 2

Explanation:

Here, there are 5 pace readings which are (6,8,5,10,7) and the maximum allowable pace threshold is 7. 
There are two pace readings that exceed the threshold of 7 which are 8 and 10. 
Hence, 2 is returned as the output.
*/

import java.util.*;

public class exam_29thOct_LinasMarathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int[] input3 = new int[input1];

        for(int i = 0; i < input1; i++){
            input3[i]= sc.nextInt();
        }

        System.out.println(paceDifference(input1, input2, input3));

        sc.close();
    }

    static int paceDifference(int input1, int input2, int[] input3){
        int count = 0;
        for(int i = 0; i < input1; i++){
            if(input3[i] > input2){
                count++;
            }
        }
        return count;
    }
}