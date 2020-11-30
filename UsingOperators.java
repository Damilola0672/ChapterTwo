import java.util.Scanner;

public class UsingOperators {
   public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);

   int firstNumber;
   int secondNumber;
   
   System.out.println("Enter first number: ");
   firstNumber = userInput.nextInt();

   System.out.println("Enter second number: ");
   secondNumber = userInput.nextInt();

   if (firstNumber == secondNumber)
   System.out.printf("%d == %d%n", firstNumber, secondNumber);
 
  
   if (firstNumber != secondNumber)
   System.out.printf("%d != %d%n", firstNumber, secondNumber);

   if (firstNumber < secondNumber)
   System.out.printf("%d < %d%n", firstNumber, secondNumber);
  
   if (firstNumber > secondNumber)
   System.out.printf("%d > %d%n", firstNumber, secondNumber);
   
   if (firstNumber <= secondNumber)
   System.out.printf("%d <= %d%n", firstNumber, secondNumber);

   if (firstNumber >= secondNumber)
   System.out.printf("%d >= %d%n", firstNumber, secondNumber);
   }
}

