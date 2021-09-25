package paintCompanyJavaAssignment;

/* Alexis Olivo
 * ITSE-2317 2801
 * September 25th 2021
   Program that determines total cost to hire a painting company */


import java.util.Scanner; //input

public class PaintCompany {

	public static void main(String[] args) {
		
		//initialization
		
		Scanner input = new Scanner(System.in);// to receive user input
		int totalSqrFt = 0; //to get total square footage
		int numGallons; //total number of paint gallons
		int laborHours; //total number of labor hours
		double paintCost; //cost of one gallon of paint
		double paintTotal; //cost of all paint
		double laborCharges; //total labor cost
		double total; // total cost
		
		System.out.print("Please enter the number of rooms to be painted: ");
		int numRooms = input.nextInt(); // number of rooms
		
		System.out.println(" ");
		
		// loop to get total square footage
		for(int i = 1; i <= numRooms; i++) {
			
			System.out.print("Please enter the square footage of room " + i + ": ");
			totalSqrFt += input.nextInt();
			
			System.out.println(" ");
		}
		
		//gets cost of paint
		System.out.print("Please enter the cost of one gallon of your paint of choice: ");
		paintCost = input.nextDouble();
		
		System.out.println(" ");
		
		//method calls
		numGallons = paintGallons(totalSqrFt);
		laborHours = laborHours(totalSqrFt);
		
		paintTotal = paintCost(paintCost, numGallons);
		laborCharges = laborCharges(laborHours);
		
		total = totalCost(paintTotal, laborCharges);
		
		//output
		
		System.out.println("Number of Gallons: " + numGallons);
		System.out.println("Hours of Labor: " + laborHours + " Hours");
		System.out.println("Cost of Paint: " + paintTotal);
		System.out.println("Labor Charges: " + laborCharges);
		
		System.out.println(" ");
		
		System.out.println("Total Price of Paint Job: " + total);
		

	}
	
	public static int paintGallons(int sqrFeet) { //divides square feet by 100 to determine number of paint gallons
		int paint;
		
		if (sqrFeet / 100 < 1) {
			paint = 1;
		}
		else {
			paint = sqrFeet / 100;
		}
		
		return paint;
	}
	
	public static int laborHours(int sqrFeet) { // divides square feet by 100 and then multiplies that by 8 to determine number of labor hours
		int hours = (sqrFeet / 100) * 8;
		return hours;
	}
	
	public static double paintCost(double price, int amount) { // multiplies price of paint by amount of paint to find total paint cost
		double cost = price * amount;
		return cost;
	}
	
	public static double laborCharges(int hours) { // multiplies labor hours by 20 dollar wage to find total labor cost
		double charges = hours * 20.00;
		return charges;
	}
	
	public static double totalCost(double paint, double labor) { // adds paint cost and labor cost for total cost
		double total = paint + labor;
		return total;
	}

}
