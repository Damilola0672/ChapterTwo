public class SumFromZeroToSixteenIncrementByTwo {
  
   public static void main(String[] args) {
   
   int sum = 0;
   int counter = 0;	// Can be more descriptive. You can use e.g. numbersToAdd

   while (counter <= 16) {
   sum = sum + counter;
   System.out.printf("Sum is %d%n", sum);
   counter += 2;
   }
   }
}