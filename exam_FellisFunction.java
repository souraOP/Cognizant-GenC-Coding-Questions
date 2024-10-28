/*
Morris Fellis has come up with a new function called the Fellis Function. Morris defines the function as follow:

 - f(0) = (1)
 - f(1) = (1)
 - f(N) = (f(N-1) + 7 * f(N-2) + (N/4)) modulo 1e^9 + 7.

 Given an integer N, your task is to help Morris find and return an integer value of f(N), after performing the Fellis Function.
 
Note: Here division operator is an integer division operator i.e., it divides two numbers and returns the integer part of the result.

Input Specification:
input1: An integer value N representing the Fellis Function value.

Output Specification:
Return an integer value of f(N), after performing the Fellis Function.

Example:

input1: 3
*/


import java.util.*;


public class exam_FellisFunction {
    private static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long output = fellisFunction(n);
        System.out.println(output);
        sc.close();
    }

    static long fellisFunction(int n){
        if(n == 0 || n == 1) return 1;
        // storing the initial values
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            long term = (7 * dp[i-2]) % MOD;
            long sum = dp[i-1] + term % MOD;

            sum = (sum + (i / 4)) % MOD;
            dp[i] = sum;

        }
        return dp[n];
    }
}

