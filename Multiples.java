// Exrecise 2.26
import java.util.Scanner;

public class Multiples {
  public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
    
     int firstInteger;
     int secondInteger;
	 
   System.out.println("Enter first integer: ");
     firstInteger = userInput.nextInt();
	 
   System.out.println("Enter second integer: ");
     secondInteger = userInput.nextInt();
	 
	if (firstInteger % secondInteger ==  0){
		System.out.printf("%d is a multiple of %d", firstInteger, secondInteger);
    }
	
	if (firstInteger % secondInteger != 0) {
		System.out.printf("%d is not a multiple of %d", firstInteger, secondInteger);
    }
  }
}