/*
This question was actually asked in cognizant GenC exam 

In a bustlin tech company, a data scientist is tasked with preparing a dataset for analysis. She needs to create a 'Double Dataset' to conduct various experiments. This dataset should consists of the original list of user data followed by an exact duplicate to ensure that her models have enough data for testing.

You are given the dataset in the form on and array A your task is to return an array which consists of the original array followed by the same array.

Input 1: An integer array A representing the dataset.
Input 2: An integer value representing the length of the array.

Output: Return an array which consists of the original array followed by the same array.

Example 1:

input1: [1, 2, 1]
input2: 3

output: [1, 2, 1, 1, 2, 1]

*/

import java.util.*;

public class DoubleDataset {
    public static int[] doubleDataset(int[] arr, int n){
        int[] output = new int[2 * n];
        for(int i = 0; i < n; i++){
            output[i] = arr[i];
            output[i + n] = arr[i];
        }
        return output;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] input1 = {1, 2, 1};
        int input2 = 3;
        int[] output = doubleDataset(input1, input2);
        // int[] output = Arrays.copyOf(input1, input2 * 2);
        // System.arraycopy(input1, 0, output, input2, input2);
        // System.out.println(Arrays.toString(output));  // [1, 2, 1, 1, 2, 1]

        for(int n: output){
            System.out.print(n + " "); //  1 2 1 1 2 1 
        }
        // sc.close();
    }
}