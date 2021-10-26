import java.util.*;
public class Main
{
    public static void main(String[] arts)
    {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter x ");
        int x = sca.nextInt();
        sca.close();

        List<Integer> A = new ArrayList<Integer>();
        for(int i=2; i<=4; i++)
            A.add(i);
        List<Integer> B = new ArrayList<Integer>();
        for(int i=1; i<=6; i++)
            B.add(i);
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // kümeler tanımlandı x alındı


        // x in A
        System.out.println("x in A:                                " + A.contains(x));

        //x in B
        System.out.println("x in B:                                " + B.contains(x));

        // x only in A
        boolean b1 = (A.contains(x) && !B.contains(x));
        String str1 = String.valueOf(b1);
        System.out.println("x only in A:                           " + str1);

        // x only in B
        boolean b2 = (B.contains(x) && !A.contains(x));
        String str2 = String.valueOf(b2);
        System.out.println("x only in B:                           " + str2);

        // a and b intersection
        boolean b3 = (B.contains(x) && A.contains(x));
        String str3 = String.valueOf(b3);
        System.out.println("x in a n b:                            " + str3);

        // a or b
        boolean b4 = (B.contains(x) || A.contains(x));
        String str4 = String.valueOf(b4);
        System.out.println("x in a or b:                           " + str4);

        // x in symm. diff of A and B
        boolean b5 = (b1 || b2);
        String str5 = String.valueOf(b5);
        System.out.println("x in symmetric difference of A and B:  " + str5);

    }
}
