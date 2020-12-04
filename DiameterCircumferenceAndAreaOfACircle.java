// Exercise 2.28
import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
   public static void main(String[] args) {
     
	 Scanner userInput = new Scanner(System.in);
	 
     int radius;
     int diameter;
	 double circumference;
	 double area;
	 double pie = 3.14159;
	 
	 System.out.println("Enter radius");
	   radius = userInput.nextInt();
	   
	 diameter = 2 * radius;
	 System.out.printf("Diameter is %d%n", diameter);
	  
		
	 circumference = 2 * pie * radius;
	 System.out.printf("Circumference is %.2f%n", circumference);
	 
		
	 area = pie * radius * radius;
	 System.out.printf("Area is %.2f%n", area);
		}
	 }
 