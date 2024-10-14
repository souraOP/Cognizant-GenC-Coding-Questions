/*
Problem Statement – Goutam and  Tanul plays  by  telling numbers.  Goutam says a number to Tanul.  Tanul should first reverse the number and check if it is same as the original.  If yes,  Tanul should say “Palindrome”.  If not, he should say “Not a Palindrome”.  If the number is negative, print “Invalid Input”.  Help Tanul by writing a program.

Sample Input 1 :

21212

Sample Output 1 :

Palindrome

Sample Input 2 :

6186

Sample Output 2 :

Not a Palindrome
 */

 import java.util.*;
 
 public class Palindrome {
    public static boolean checkPalindrome(int n){
        int temp = n, rev = 0;
        while(temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(checkPalindrome(n)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
            
        sc.close();
    }
 }