// Example 2.7 Java How To Program
// Addition program that inputs two numbers then displays their sum
// Algorithm: Declare class,, declare the variables, import Scanner(to allow input from user), prompt user for first number input, assign input to number, prompt user for second input, assign second input to second number, add first and second number, assign total in sum/store total in sum, printf the sum.

import java.util.Scanner;

public class AddingTwoNumbers {

   public static void main(String[] args) {

   int firstNumber;
   int secondNumber;
   int sum;

   Scanner input = new Scanner(System.in);
   System.out.println("Enter first number:");
     firstNumber = input.nextInt();
    
     System.out.println("Enter second number:");
     secondNumber = input.nextInt();
     
     sum = firstNumber + secondNumber;

     System.out.printf("Sum is %d%n", sum);
   }
}