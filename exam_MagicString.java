/*
Magic String

Eva has a string S containing lowercase English letters. She wants to transform this string into Magic String, where all characters in the string are same. To do so she can replace any letter in the string with another letter present in that string.

Your task is to help Eva find and return an integer value, representing the minimum number of steps required to form a Magic String. Return 0, if S is already a Magic String.

Input Specification:

Input: A string S, containing lowercase English Letters

output: Return an integer value, representing the minimum number of steps required to form a Magic String. Return 0, if S is already a Magic String.

Example1:

input: aaabbbccdddd
output: 8
*/
import java.util.*;

public class exam_MagicString {
    static int getMagicString(String str){
        int[] charCount = new int[26];
        for(char c: str.toCharArray()){
            charCount[c - 'a']++;
        }
        int maxFreq = 0;
        for(int count: charCount){
            if(count > maxFreq){
                maxFreq = count;
            }
        }
        return str.length() - maxFreq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = getMagicString(input);
        System.out.println(output);
        sc.close();
    }
}
