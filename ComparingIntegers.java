//Exercise 2.16
import java.util.Scanner;

public class ComparingIntegers {
  public static void main(String[] args) { 
  Scanner userInput = new Scanner(System.in);
  
  int firstInteger;
  int secondInteger;
 
  System.out.println("Enter first integer: ");
   firstInteger = userInput.nextInt();
   
  System.out.println("Enter second integer: ");
   secondInteger = userInput.nextInt(); 
   
   if (firstInteger == secondInteger)
   System.out.printf("These numbers are equal %d == %d%n", firstInteger, secondInteger);
   
   if (firstInteger > secondInteger)
   System.out.printf("%d is larger > %d%n", firstInteger, secondInteger);
   
   if (secondInteger > firstInteger)
   System.out.printf("%d is larger > %d%n", secondInteger, firstInteger);
   
  }
}