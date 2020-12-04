// Exercise 2.25
import java.util.Scanner;
public class OddOrEven {
   public static void main(String[] args) {
   Scanner userInput =  new Scanner(System.in);
     
	 int integer;
	 
	 System.out.println("Enter integer: ");
	   integer = userInput.nextInt();
	   
	   
	   if (integer %  2 == 0) {
	   System.out.printf("%d is an even number", integer);
	   }
	   
	   if (integer % 2 != 0) {
	   System.out.printf("%d is an odd number", integer);
       }
   }
}