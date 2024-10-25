/*

You are out shopping in a grocery mall and you have listed all the items you want to buy in an integer array A of length N in one operation, you can swap any two items on the list. Your task is to find and return an integer value representing the minimum possible sum of any two consecutive items on the list after performing the operation anu number of times.

Input Specification:

input1: An integer value N representing the number of items on the list
input2: AN integer array A containing the items

Output Specification:

Return an integer value representing the minimum possible sum of any two consecutive items on the list after performing the operation any number of times.

Example 1:

input1: 3
input2: [3, 5, 1]

output: 4

 */

import java.util.Arrays;
import java.util.Scanner;

public class exam_SumOfConsecutive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items on the list: ");
        int input1 = sc.nextInt();
        int[] input2 = new int[input1];
        System.out.print("Enter the items: ");
        for(int i = 0; i < input1; i++){
            input2[i] = sc.nextInt();
        }
        Arrays.sort(input2);
        int min = input2[0] + input2[1];
        System.out.println("Answer: " + min);
        sc.close();
    }
}
