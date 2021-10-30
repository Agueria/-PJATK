import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.print("a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print("c ");
        Scanner sc2 = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.print("d ");
        Scanner sc3 = new Scanner(System.in);
        int d = sc.nextInt();
        sc.close();
        System.out.println(String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c)+ " " + String.valueOf(d));
        // Scanner
        int Biggest = a;
        int Smallest =b; 
        if (a > b && a > c && a > d){
            Biggest = a;
        }
        if (b > a && b > c && b > d){
            Biggest = b;
        }
        if (c > a && c > b && c > d){
            Biggest = c;
        }
        if (d > a && d > b && d > c) {
            Biggest = d;
        }
        if (a < b && a < c && a < d){
            Smallest = a;
        }
        if (b < a && b < c && b < d){
            Smallest = b;
        }
        if (c < a && c < b && c < d){
            Smallest = c;
        }
        if (d < a && d < b && d < c){
            Smallest = d;
        }
        System.out.println(Biggest-Smallest);
    }
}
