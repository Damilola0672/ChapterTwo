// Exercise 2.33
import java.util.Scanner;

public class BodyMassIndexCalculator {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);

     double weightInPounds;
	 double heightInInches;
	 double bmiValue = 0;
	 
	 System.out.println("Enter user's weight: ");
	   weightInPounds = userInput.nextDouble();
	   
	 System.out.println("Enter user's height: ");
	   heightInInches = userInput.nextDouble();
	     
	   
	   bmiValue = (weightInPounds * 703) / (heightInInches * heightInInches);
	   
	   if (bmiValue < 18.5) {
		System.out.printf("%.2f Underweight", bmiValue);
	   }
	   
	   if (bmiValue > 18.5 && bmiValue < 24.9) {
	     System.out.printf("%.2f Normal", bmiValue);
	   }
	   
	  if (bmiValue > 25 && bmiValue < 29.9) {
	     System.out.printf("%.2f Overweight", bmiValue);
	   } 
	   
	  if (bmiValue >= 30) {
	     System.out.printf("%.2f Obese", bmiValue);
	  }
   }
}