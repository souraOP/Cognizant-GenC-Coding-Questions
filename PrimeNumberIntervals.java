/*
Problem Statement – To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?

Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop.

Sample Input 1:
2
15

Sample Output 1:  2 3 5 7 11 13

Sample Input 2:
8
5

Sample Output 2:  Provide valid input

*/


import java.util.*;

public class PrimeNumberIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag;
        if(a >= b || a <= 0 || b <= 0){
            System.out.println("Please provide a valid input!");
            System.exit(0);
        } else {
            while(a <= b){
                if(a == 2){
                    System.out.print(a + " ");
                } else if(a == 1){
                    a++;
                    continue;
                } else {
                    flag = 0;
                    for (int i = 2; i <= a/2; i++) {
                        if(a % i == 0){
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.print(a + " ");
                    }
                    a++;
                }

                
               
            }
        }
        
        sc.close();
    }
}