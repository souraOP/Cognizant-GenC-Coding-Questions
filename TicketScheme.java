/*
Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:

Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k

Sample Output 1:

Ticket cost:4065.25

Sample Input 2:

Enter the no of ticket:1

Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets

 */

import java.util.*;

public class TicketScheme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = 0;
        System.out.print("Enter the no. of ticket: ");
        int ticket = sc.nextInt();
        if(ticket < 5 || ticket > 40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            System.exit(0);
        }

        System.out.print("Do you want refreshment? (y/n): ");
        char ref = sc.next().charAt(0);

        System.out.print("Do you have a coupon code? (y/n): ");
        char couponCode = sc.next().charAt(0);

        System.out.print("Enter the circle (k/q): ");
        char circleCode = sc.next().charAt(0);

        if(circleCode == 'k'){
            cost = 75 * ticket;
        } else if (circleCode == 'q'){
            cost = 150 * ticket;
        } else {
            System.out.println("Invalid Input!");
            System.exit(0);
        }

        double totalCost = cost;
        if(ticket > 20){
            cost = cost - ((0.1) * cost);
            totalCost = cost;
        }
        if(couponCode == 'y' || couponCode == 'Y'){
            totalCost = cost - ((0.02) * cost);
        }
        if(ref == 'y' || ref == 'Y'){
            totalCost += (ticket * 50);
        }
        System.out.printf("Ticket cost %.2f", totalCost);



        sc.close();
    }
}
