/*
Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Sample Input 1:

Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:

Highest placement
CSE

Sample Input 2:

Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:

Highest placement
ECE

MECH

Sample Input 3:

Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:

None of the department has got the highest placement
Sample Input 4:

Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:

Input is Invalid


 */

import java.util.*;

public class MaximumPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students placed in CSE: ");
        int CSE = sc.nextInt();
        System.out.print("Enter the no. of students placed in ECE: ");
        int ECE = sc.nextInt();
        System.out.print("Enter the no. of students placed in MECH: ");
        int MECH = sc.nextInt();

        if(CSE < 0 || ECE < 0 || MECH < 0){
            System.out.println("Invalid Input");
            System.exit(0);
        } else if(CSE == MECH && CSE == ECE){
            System.out.println("None of the department has got the highest placement.");
            System.exit(0);
        } else {
            if(CSE > ECE && CSE == MECH) {
                System.out.println("Highest placement: CSE | MECH");
            } else if(CSE > MECH && CSE == ECE) {
                System.out.println("Highest placement: CSE | ECE");
            } else if(ECE > CSE && ECE == MECH){
                System.out.println("Highest placement: ECE | MECH");
            } else if (CSE > ECE && CSE > MECH){
                System.out.println("Highest placement: CSE");
            } else if (ECE > MECH){
                System.out.println("Highest Placement: ECE");
            } else {
                System.out.println("Highest Placement: MECH");
            }
        }

        sc.close();
    }
}