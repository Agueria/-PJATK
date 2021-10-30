package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter fuel consumption and units (\"eu\" or \"usa\") ");
        Scanner sc = new Scanner(System.in);
        int inputQuantity = sc.nextInt();
        String input = sc.nextLine();
        sc.close();


        if (input.contains("usa")){
            String inputunit = "usa";
            System.out.println(inputunit);
            //int usaToEu = inputQuantity
        }


        if (input.contains("eu")){
            String inputunit = "eu";
            System.out.println(inputunit);
            int euToUsa = inputQuantity*235;
            System.out.println(euToUsa);
        }


        else{
            System.out.println("Wrong input");
        }
    }
}
