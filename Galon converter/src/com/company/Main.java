package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter fuel consumption and units (\"eu\" or \"usa\") ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        float coef = Float.parseFloat("235.214583");
        boolean x = (input.contains("usa"));
        boolean y = (input.contains("eu"));

        if (input.contains("usa")){
            int inlen = input.length();
            float inq = Float.parseFloat(input.substring(0,(inlen-4)));
            //1 mpg = 235.21 l/100km
            float usatoeu = coef/inq;
            System.out.println(inq + " mpg = " + usatoeu + "L/100km");
        }

        if (input.contains("eu")) {

            int inlen = input.length();
            float inq = Float.parseFloat(input.substring(0, (inlen - 3)));
            // 1 L/100km = 1/235.21 mpg
            float eutousa = coef / inq;
            System.out.println(inq + " L/100km = " + eutousa + " mpg");

        }

        if(x == y){
            System.out.println("Wrong input");
        }

    }
}
