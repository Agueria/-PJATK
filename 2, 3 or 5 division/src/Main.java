import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.print("Number 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        sc.close();
        System.out.println(String.valueOf(a)+" "+String.valueOf(b));
        if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 && b % 2 == 0 || b % 3 == 0 || b % 5 == 0) {
            boolean commonDivision = true;
            System.out.println(commonDivision);
        }
        else
         {
             boolean commonDivision = false;
             System.out.println(commonDivision);
         }

    }
}
