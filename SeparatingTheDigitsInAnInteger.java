// Exercise 2.30
import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);
     
	  int number;
	  int firstDigit;
	  int secondDigit;
	  int thirdDigit;
	  int fourthDigit;
	  int fifthDigit;
	  int variableOne;
	  int variableTwo;
	  int variableThree;
	  int variableFour;
	  
	 System.out.println("Enter number");
	   number = userInput.nextInt();
	   
	fifthDigit =  number % 10;
	variableOne = number / 10;
	fourthDigit = variableOne % 10;
	variableTwo = variableOne / 10;
	thirdDigit = variableTwo % 10;
	variableThree = variableTwo / 10;
	secondDigit = variableThree % 10;
	variableFour = variableThree / 10;
	
	System.out.printf("%d   %d   %d   %d   %d", 	variableFoursecondDigit,  thirdDigit, fourthDigit, fifthDigit);
   }
}