/*

Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during break time he bought pizzas, puffs and cool drinks. Consider the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!

 */
import java.util.*;

public class GenerateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of pizzas bought: ");
        int pizza = sc.nextInt();
        System.out.print("Enter the no. of puffs bought: ");
        int puffs = sc.nextInt();
        System.out.print("Enter the no. of cold drinks bought: ");
        int coldDrink = sc.nextInt();

        System.out.print("\n\nNo. of pizzas: " + pizza);
        System.out.print("\nNo. of puffs: " + puffs);
        System.out.println("\nNo. of cold drink: " + coldDrink);
        System.out.println("Total price = " + (pizza*100 + puffs * 20 + coldDrink * 10));
        System.out.println("ENJOY THE SHOW!!!");
        sc.close();
    }
}
