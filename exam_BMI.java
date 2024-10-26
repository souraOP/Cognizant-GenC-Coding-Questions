/*
In a fitness program, people are admitted based on their BMI value. You are given the height and weight for N people. Your task is to find and return the number of people who will be admitted into the program if the maximum allowed BMI value is 'K'.

Note: Formula for BMI = (Weight/(Height))*10

Input Specification:

input1: An integer value N representing the number of people
input2: An integer array representing the height of N people
input3: An integer array representing the weight of N people
input4: An intger value K representing the maximum allowed BMI value

Output Specification:

Return an integer value representing the number of people who will be admitted into the program

Example 1:

input1: 5
input2: [165, 172, 180, 158, 190]
input3: [68, 82, 61, 91, 75]
input4: 4
*/

import java.util.Scanner;

public class exam_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int[] i2 = new int[i1];
        int[] i3 = new int[i1];
        for(int i = 0; i < i1; i++){
            i2[i] = sc.nextInt();
        }
        for (int i = 0; i < i1; i++) {
            i3[i] = sc.nextInt();
        }
        int i4 = sc.nextInt();

        System.out.println(getAdmissionCheck(i1, i2, i3, i4));
        sc.close();
    }

    static int getAdmissionCheck(int i1, int[] i2, int[] i3, int i4) {
        int count =0;
        for(int i = 0; i<i1;i++){
            double bmi = (double) i3[i]/i2[i] * 10;
            if(bmi<= i4){
                count++;
            }
        }
        return count;
    }
}
