// Question: Add numbers from 1 to 10, that is 1+2+3+4+5+6+7+8+9= 45
/* Algorithm: Declare the class, write the main method, initialize sum to 0, 
initialize counter(i) to 1, set the condition, add sum to counter and reassign to sum, increment counter by 1, print */

public class SumFromOneToTenInrementByOne {

   public static void main(String[] args) {
   
   int sum = 0, i = 1;

   while (i < 10) {
   sum = sum + i;
     i++;
     }
   System.out.println("sum is " + sum);
   }
}