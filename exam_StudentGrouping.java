/*
You are a teacher organizing a field trip for your students. You have a class of N students and you want to divide them into two groups for the trip. However, you have a special requirement; one group should only consist of students with even-numbered IDs, and the other group should only consist of students with odd-number IDs and both the groups must be of the same length. Your task is to find and return an integer value representing the maximum number of students that can be included in both groups.

Input Specification: 
input1: An integer value N representing the total number of students
input2: An integer array containing the IDs of the students

Output Specification:  Return an integer value representing the maximum number of students that can be included in both groups.

Example1: 
input1: 4
input2: [5, 2, 3, 6]

Output: 2
*/
import java.util.*;

public class exam_StudentGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] input2 = new int[input1];
        for(int i = 0; i < input1; i++){
            input2[i] = sc.nextInt();
        }
        System.out.println(getMaxStudents(input1, input2));

        sc.close();
    }

    static int getMaxStudents(int n, int[] arr){
        int even = 0, odd = 0;
        for(int i: arr){
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);  // Math.min because we have to find out that number that can be included in both the groups. So if one group has 4 and another has say 2 or 3 .. then doing Math.max will give us 4 - which is not the correct as the other group cannot accomodate 4 ppl.
    }
}
