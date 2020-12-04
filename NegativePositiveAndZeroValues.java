//Exercise 2.32
import java.util.Scanner;

public class NegativePositiveAndZeroValues {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);
	 
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int fifthNumber;
		int positiveNumbers =  0;
		int zeros =  0;
		int negativeNumbers =  0;
		

      System.out.println("Enter first number: ");
	    firstNumber = userInput.nextInt();
		  if (firstNumber > 0) {
          	positiveNumbers = positiveNumbers + 1;
		  }
		  
		  if (firstNumber == 0) {
          	zeros = zeros + 1;
		  }
		  
		  if (firstNumber < 0) {
          	negativeNumbers = negativeNumbers + 1;
		  }	      
	
	  System.out.println("Enter second number: ");
		 secondNumber = userInput.nextInt();
		   if (secondNumber > 0) {
			 positiveNumbers++;
		   }
		   
		   if (firstNumber == 0) {
			  zeros++;
		   }  
		
           if (firstNumber < 0) {
             negativeNumbers++;
		   } 
		   
	  System.out.println("Enter third number: ");
	    thirdNumber = userInput.nextInt();
		  if (thirdNumber > 0) {
			 positiveNumbers++;
		   }
		   
		   if (thirdNumber == 0) {
			  zeros++;
		   }  
		
           if (thirdNumber < 0) {
             negativeNumbers++;
		   } 
		
	  System.out.println("Enter fourth number: ");
	    fourthNumber = userInput.nextInt();
		  if (fourthNumber > 0) {
			 positiveNumbers++;
		   }
		   
		   if (fourthNumber == 0) {
			  zeros++;
		   }  
		
           if (fourthNumber < 0) {
             negativeNumbers++;
		   } 
		
	  System.out.println("Enter fifth number: ");
	    fifthNumber = userInput.nextInt();
		  if (fifthNumber > 0) {
			 positiveNumbers++;
		   }
		   
		   if (fifthNumber == 0) {
			  zeros++;
		   }  
		
           if (fifthNumber < 0) {
             negativeNumbers++;
		   } 
		System.out.printf("Number of negative numbers input is %d%n", negativeNumbers);
		System.out.printf("Number of positive numbers input is %d%n", positiveNumbers);
		System.out.printf("Number of zeros input is %d%n", zeros);
	}
}
	 
