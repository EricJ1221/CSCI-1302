//Eric Oliver, Olivere, 6/8/2021
//This program will prompt the user to enter a "Social Security Number" in the "DDD-DD-DDDD" format and check whether the input is a valid "SSN" or not.

import java.util.Scanner;

public class CheckSSN {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a SSN: ");
      String ssn = input.nextLine();
      
      boolean isValid = ((ssn.length() == 11) && (ssn.charAt(0) <= '9') && (ssn.charAt(0) >= '0') && (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2))) && (ssn.charAt(3) == '-') && (Character.isDigit(ssn.charAt(4))) && (Character.isDigit(ssn.charAt(5))) && (ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(7))) && (Character.isDigit(ssn.charAt(8))) && (Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10))));      
      if(isValid)
         System.out.println(ssn + " is a valid social security number.");
      else
         System.out.println(ssn + " is an invalid social security number.");
   }
}