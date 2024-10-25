/*
You are given a string S and your task is to find and return the count of permutations formed by fixing the positions of the vowels present in the string.

Note: 
 - Ensure the result is non-negative
 - If there are no components then return 0

 Input Specification"

 input: A String S
 output: Return an integer value representing the count of permutations formed by fixing the positions of the vowels present in the string.

 Example 1:

 input: ABC
 output: 2
 */

import java.util.*;

public class exam_StringPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int output = func(str);
        System.out.println(output);
        sc.close();
    }

    static int func(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');

        int vcount = 0;
        int nonVcount = 0;
        for(char c: str.toCharArray()){
            if(vowel.contains(c)){
                vcount++;
            }else {
                nonVcount++;
            }
        }
        if(vcount == 0){
            return 0;
        }

        return factorial(nonVcount);
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int res = 1;
        for(int i = 1; i<=n; i++){
            res = res * i;
        }
        return res;
    }
}
