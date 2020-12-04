// Exercise 2.17
import java.util.Scanner;

public class SmallestAndLargestInteger {
   public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);
    
	int firstInteger;
	int secondInteger;
	int thirdInteger;
	int sum;
	int average;
	int product;
	int max;
	int min;
	
	System.out.println("Enter first integer: ");
	  firstInteger = userInput.nextInt();
	    min = firstInteger;
		max = firstInteger;
		
    System.out.println("Enter second integer: ");
	  secondInteger = userInput.nextInt();
	    if (secondInteger < min) {
			min = secondInteger;
		}
	    if (secondInteger > max) {
			max = secondInteger;
		}
	  	 
	System.out.println("Enter third integer: ");
	  thirdInteger = userInput.nextInt();
	    if (thirdInteger < min) {
		    min = thirdInteger;
		}
		if (thirdInteger > max) {
			max = thirdInteger;
		}
	    System.out.printf("Max is %d%n", max);
		System.out.printf("Min is %d%n", min);
	  
	  sum = firstInteger + secondInteger + thirdInteger;
	  System.out.printf("Sum: %d%n", sum);
	  
	  average = sum / 3;
	  System.out.printf("Average: %d%n", average);
	  
	  product = firstInteger * secondInteger * thirdInteger;
	  System.out.printf("Product: %d%n", product);
	  
	  	  
   }
}