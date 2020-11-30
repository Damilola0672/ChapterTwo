import java.util.Scanner;

public class Arithmetic2 {
   public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
   
   double firstInteger;		// Not using int to declare the variables coz double is used for quotient. Once the type for
				// int is changed to double, others too must be changed coz the userInput type in the System.out.print 
				// will have to be changed to double too
   double secondInteger;
   double sum;
   double product;
   double difference;
   double quotient;

   System.out.println("Enter First Integer: ");
    firstInteger = userInput.nextDouble();

   System.out.println("Enter second Integer: ");
    secondInteger = userInput.nextDouble();
   
   sum = firstInteger + secondInteger;
   System.out.printf("Sum is %.2f%n", sum);

   product = firstInteger * secondInteger;
   System.out.printf("Product is %.2f%n", product);

   difference = firstInteger - secondInteger;
   System.out.printf("Difference is %.2f%n", difference);

   quotient = firstInteger / secondInteger;
   System.out.printf("Quotient is %.2f%n", quotient);
   }
}