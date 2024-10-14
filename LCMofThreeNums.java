import java.util.*;

public class LCMofThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int lcm = getLcm(a, b, c);
        System.out.println("LCM of " + a + ", " + b + ", " + c + ": " + lcm);

        sc.close();
    }

    static int getLcm(int a, int b, int c){
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        gcd = findGCD(lcm, c);
        lcm = (lcm * c)/gcd;
        return lcm;
    }

    static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a % b);
    }
}
