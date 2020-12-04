//Exercise 2.24
import java.util.Scanner;

public class LargestAndSmallestOfFiveIntegers {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
	  
	  int firstInteger;
	  int secondInteger;
	  int thirdInteger;
	  int fourthInteger;
	  int fifthInteger;
	  int max;
	  int min;
	  int tempInteger;
	  
	System.out.println("Enter first integer: ");
	  firstInteger =  userInput.nextInt();
	     min = firstInteger;
		 max = firstInteger;
		 
    System.out.println("Enter second integer: ");
	  secondInteger =  userInput.nextInt();
         if (secondInteger < min) {
	       min = secondInteger;
	     }
	     if (secondInteger > max) {
	       max = secondInteger;  
	     }
 
    System.out.println("Enter third integer: ");
	  thirdInteger =  userInput.nextInt();
          if (thirdInteger < min) {
	        min = thirdInteger;
	      }
	      if (thirdInteger > max) {
	        max = thirdInteger;
          }
		  
    System.out.println("Enter fourth integer: ");
	  fourthInteger =  userInput.nextInt();
          if (fourthInteger < min) {
	         min = fourthInteger;
	      }
	      if (fourthInteger > max) {
	         max = fourthInteger;
          }
    System.out.println("Enter fifth integer: ");
	  fifthInteger =  userInput.nextInt();
         if (fifthInteger < min) {
	       min = fifthInteger;
	     }
	     if (fifthInteger > max) {
	       max = fifthInteger;	 
         }

       System.out.printf("Max is %d%n ", max);
       System.out.printf("Min is %d%n ", min);
       	   	   
   }
}