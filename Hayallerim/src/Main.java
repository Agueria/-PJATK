import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.print("a ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        System.out.print("b ");
        Scanner sc1 = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        System.out.print("c ");
        Scanner sc2 = new Scanner(System.in);
        boolean c = sc.nextBoolean();
        sc.close();
        System.out.println(String.valueOf(a)+" "+String.valueOf(b)+" "+String.valueOf(c));
        // Boolean tanımlama burada bitiyor, inputu vermeye başlıyoruz

        if(a == b && b == c && a == true) {
            boolean allThree = true;
            System.out.println("All Three: " + allThree);
        }
        else{
            boolean allThree = false;
            System.out.println("All Three: " + allThree);
        }
        // AllThree bitti
        // EcatlyOne
        if (a == true && b == false && c == false || a == false && b == true && c == false || a == false && b == false && c == true) {
            boolean ExactylOne = true;
            System.out.println("Exactly One:" + ExactylOne);
        }
        else{
            boolean ExactlyOne = false;
            System.out.println("Exactly One:" + ExactlyOne);
        }
        //ExactlyOne Bitti
        //Exactly Two
        if (a == true && b == true != c || a == true && c == true != b || a != c == true && b == true) {
            boolean ExactylTwo = true;
            System.out.println("Exactly Two:" + ExactylTwo);
        }
        else{
            boolean ExactlyTwo = false;
            System.out.println("Exactly Two:" + ExactlyTwo);
        }
        //Exactly Two bitti
        //Atleast one
        if (a == true || b == true || c == true) {
            boolean AtleastOne = true;
            System.out.println("AtleastOne:" + AtleastOne);
        }
        else{
            boolean AtleastOne = false;
            System.out.println("AtleastOne:" + AtleastOne);
        }
        //Atleast one bitti
        //Atleast Two
        //Atleast one
        if (a == true && b == true || c == true && b == true || a == true && c == true) {
            boolean AtleastTwo = true;
            System.out.println("AtleastTwo:" + AtleastTwo);
        }
        else{
            boolean AtleastTwo = false;
            System.out.println("AtleastTwo:" + AtleastTwo);
        }

    }
}