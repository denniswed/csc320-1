package modue1DiscussionPost;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    
      String userInput1, userInput2;

      Scanner inputName = new Scanner(System.in);

      System.out.println("Enter your First Name: ");
      userInput1 = inputName.nextLine();
 
      System.out.println("Last Name: ");
      userInput2 = inputName.nextLine();
 
      System.out.println("The World says Hello, " + userInput1 + " " + userInput2 + "!");
    }
}