package zybooks_4_13;

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
     Scanner scnr1 = new Scanner(System.in);
     Scanner scnr2 = new Scanner(System.in);
     final String BEGINNING_STATEMENT = "Eating ";
     final String END_STATEMENT = " a day keeps you happy and healthy.";
     int userCount;
     String userString;
     
     while (true) {
        System.out.println("Enter a word: ");
        userString = scnr1.nextLine();
        if (userString.equalsIgnoreCase("quit")) {
        	break;
        }
        System.out.println("Enter a number: ");
        userCount = scnr2.nextInt();
        if (userCount <= 0) {
        	break;
        }
        System.out.println(BEGINNING_STATEMENT + userCount + " " + userString + END_STATEMENT);
     }  
     scnr1.close();
     scnr2.close();
   }
}
// for whatever reason this doesnt work in zybooks lab. whatever