/*
You're at a school fundraiser where student have brought in jars of coins of donate. Each jar contains different amounts, but some students accidentally brought in the same amount. You want to tally the total donation by only counting each unique amount of coins once.
You are given the number of coins students have brought in jars, in the form of an array. Find and return the sum of all distinct coin values to see how much the school raised.

Input1: An integer array representing the number of coins in jars
Input2: An integer representing the number of students

Output: Return the sum of all distinct coin values to see how much the school raised.

Example1: 

input1: [1, 2, 3, 2]
input2: 4

output: 4
*/

// import java.util.Scanner;

import java.util.HashMap;

public class exam_SchoolFundraiser {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2};
        int n = 4, count = 0;
        
        HashMap<Integer, Integer> output = new HashMap<>();
        for(int i=0; i<n; i++){
            output.put(arr[i], output.getOrDefault(arr[i], 0) + 1);
        }

        for(int coin: output.keySet()){
            if(output.get(coin) == 1){
                count += coin;
            }
        }

        System.out.println(count);

    }
}
