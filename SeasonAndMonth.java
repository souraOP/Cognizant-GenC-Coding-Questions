/*
Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:   Enter the month:11
Sample Output 1:  Season:Autumn

Sample Input 2:   Enter the month:13
Sample Output 2:  Invalid month

*/

import java.util.*;

public class SeasonAndMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        if(month > 12 || month < 1) {
            System.out.println("Invalid month");
            System.exit(0);
        }
        if(month >= 3 && month <= 5){
            System.out.println("Season: Spring");
        } else if (month >= 6 && month <= 8){
            System.out.println("Season: Summer");
        } else if (month >= 9 && month <= 11){
            System.out.println("Season: Autumn");
        } else if(month == 12 || month == 1 || month == 2){
            System.out.println("Season: Winter");
        }
        sc.close();
    }
}