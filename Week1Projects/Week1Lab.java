//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week1Projects;

public class Week1Lab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		
		int availableSeats = 17;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		
		double costOfGroceries = 45.22;

		
		// 3. Create a variable to hold a person's middle initial
		
		char middleInitial = 'B';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		boolean isHotOutside = true;
		
		boolean isColdOutside = false;

		
		// 5. Create a variable to hold a customer's first name
		
		String firstName = "Johnny";

		
		// 6. Create a variable to hold a street address
		
		String streetAddress = "21 Jump Street";

		// 7. Print all variables to the console
		
		System.out.println("There are " + availableSeats + " seats left" );
		System.out.println("The groceries costed " + costOfGroceries + " dollars");
		System.out.println("Their middle initial is " + middleInitial);
		System.out.println("Is it hot outside? " + isHotOutside);
		System.out.println("Is it cold outside? " + isColdOutside);
		System.out.println("His first name is " + firstName);
		System.out.println("Johnny lives on " + streetAddress);
		
		
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		
		availableSeats = availableSeats - 2;
		System.out.println("There are now " + availableSeats + " Seats left");
				
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println("Your grocery total is now " + costOfGroceries);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleInitial = 'V';
		System.out.println("Your middle initial is now " + middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		
		isHotOutside = false;
		System.out.println("The weather is hot now? " + isHotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		
		String fullName = firstName + " " + middleInitial + " " + "Hackerson";
		System.out.println("His full name is " + fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		
		System.out.println("The customer's name is " + fullName + " and they live at " + streetAddress);

		
		
	}
}