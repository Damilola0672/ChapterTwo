// Exercise 2.34

public class WorldPopulationGrowthCalculators {
   public static void main(String[] args) {
     
	  double currentPopulation = 7800000000.0;
      double growthRate = 1.1;
	  double yearOnePopulation;
	  double yearTwoPopulation;

    System.out.printf("Current world population is: %.1f", currentPopulation);    
	
	  yearOnePopulation = currentPopulation * growthRate;
	System.out.printf("The estimated world population for next year is: %.1f", yearOnePopulation);
	  
	  yearTwoPopulation = yearOnePopulation * growthRate;
	System.out.printf("The estimated world population for next 2 years is: %.1f%n", yearTwoPopulation);
	
    System.out.printf("The estimated world population for next 3 years is: %.1f%n", (currentPopulation * growthRate * growthRate * growthRate ));
	
	System.out.printf("The estimated world population for next 4 years is: %.1f%n", (currentPopulation *  growthRate * growthRate * growthRate *  growthRate));
	
	System.out.printf("The estimated world population for next 5 years is: %.1f%n", (currentPopulation * growthRate * growthRate * growthRate * growthRate * growthRate));	
       }
   } 
		   
		  