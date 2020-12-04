import java.util.Scanner;

public class MinimumAndMaximumIntegers {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);

     int firstInteger;
     int secondInteger;
     int thirdInteger;
     int sum = 0;
     int average;
     int product = 1;
     int min;
     int max;
	 int tempValue;

    System.out.println("Enter first integer");
      tempValue = userInput.nextInt();
       min = tempValue;
       max = tempValue;

     sum = sum + tempValue;
	 product = product * tempValue;
	 
    System.out.println("Enter second integer");
      tempValue = userInput.nextInt();
       if (tempValue < min) {
	   min = tempValue;
	   }
	   if (tempValue > max) {
	       max = tempValue;
	   } 
	 sum = sum + tempValue;
	product = product * tempValue;
	 
		   
    System.out.println("Enter third integer");
      tempValue = userInput.nextInt();
       if (tempValue < min) {
	       min = tempValue;
	   }
	   if (tempValue > max) {
	       max = tempValue;
	   }
     sum = sum + tempValue;
	product = product * tempValue;
	 
	   
	System.out.printf("Min is %d%n", min);
	System.out.printf("Max is %d%n", max);
	 
    System.out.printf("Sum is: %d%n", sum);
    System.out.printf("Product is: %d%n", product);
	
	average = sum / 3;
    System.out.printf("Average is: %d%n", average);
	
   }
}