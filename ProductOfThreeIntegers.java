import java.util.Scanner;

public class ProductOfThreeIntegers {

   public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);
    
   int x;
   int y;
   int z;
   int product;

   System.out.println("Enter first integer: ");
     x = userInput.nextInt();

   System.out.println("Enter second integer: ");
     y = userInput.nextInt();
  
   System.out.println("Enter third integer: ");
     z = userInput.nextInt();   
   
   product = x * y * z;
   System.out.printf("Product is %d%n", product);

   }
}