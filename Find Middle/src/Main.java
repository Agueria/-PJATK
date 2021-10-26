import java.util.*;
public class Main {
    // Function to find the middle of three number
    public static int middleOfThree(int a, int b,
                                    int c)
    {
        int x = a - b;

        int y = b - c;
        int z = a - c;
        if (x * y > 0)
            return b;
        else if (x * z > 0)
            return c;
        else
            return a;
    }
    public static void main(String[] args)
    {
        int a = 7, b = 17, c = 51;
        System.out.println( middleOfThree(a, b, c) );
    }
}
