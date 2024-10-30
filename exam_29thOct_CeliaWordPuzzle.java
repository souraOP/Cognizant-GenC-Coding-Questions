/*
Celia is fascinated by word puzzles. She has a string array A of N words an wants to create a new word 
by rearranging the characters of the longest word in the list alphabetically. 
However, if the longest word contains more than one occurrence of any character, 
she will remove the duplicates befor rearranging the word.

Your task is to help Celia rearrange and return a string value representing t 
characters of the longest word in alphabetical order.

Note: If there are multiple longest words with the same length, choose the one that appears first in the array.

Input Specification:

input1: An integer value N representing the number of words.

input2: A string array A containing the words.

Output Specification:

Return a string representing the rearranged version of the longest word with duplicates removed.

Example 1:

input1: 4

input2: (apple, banana, grape, orange}

Output: abn

*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class exam_29thOct_CeliaWordPuzzle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int input1 = sc.nextInt();
        String[] input2 = new String[input1];
        for(int i = 0; i < input1; i++){
            input2[i] = sc.next();
        }
        System.out.println(wordRearrangement(input1, input2));
        sc.close();
    }   

    static String wordRearrangement(int input1, String[] input2){
        if(input1 == 0 || input2 == null || input2.length == 0){
            return "";
        }

        // get the longest word
        String longestWord=input2[0];
        for(int i = 1; i < input1; i++){
            if(input2[i].length() > longestWord.length()){
                longestWord = input2[i];
            }
        }
        // removing the duplicates from the longest word
        // convert the longestword to char array
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(char c: longestWord.toCharArray()){
            hs.add(c);
        }
        for(Character j: hs){
            sb.append(j);
        }

        char[] ch = sb.toString().toCharArray();

       Arrays.sort(ch);
       
       return new String(ch);
    }
}