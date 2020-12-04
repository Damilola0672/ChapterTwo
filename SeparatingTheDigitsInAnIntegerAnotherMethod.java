// Exercise 2.30
import java.util.Scanner;

public class SeparatingTheDigitsInAnIntegerAnotherMethod {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);
     
	  int number;
	  int firstDigit;
	  int secondDigit;
	  int thirdDigit;
	  int fourthDigit;
	  int fifthDigit;
	  
	  
	 System.out.println("Enter number");
	   number = userInput.nextInt();
	   
	fifthDigit =  number % 10;
	number = number / 10;
	fourthDigit = number % 10;
	number = number / 10;
	thirdDigit = number % 10;
	number = number / 10;
	secondDigit = number % 10;
	number = number / 10;
	
	System.out.printf("%d   %d   %d   %d   %d", number, secondDigit,  thirdDigit, fourthDigit, fifthDigit);
   }
}