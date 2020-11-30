import java.util.Scanner;

public class CalculatingTheSumOfAnUnspecifiedNumber {
   
   public static void main(String[] args) {	// Sentinel-controlled loop
     Scanner input = new Scanner(System.in);	// Create a Scanner

   System.out.print("Enter an integer (the input ends if it is 0: ");
   // used one variable named data to store the input value and use a variable named sum to store the total
   int data = input.nextInt();

   int sum = 0;			
   while (data != 0) {		// Keep reading data
     sum = sum + data;

   System.out.print("Enter an integer (the input ends if it is 0): ");
   data = input.nextInt();
   }
   System.out.println("The sum is " + sum);
   }
}