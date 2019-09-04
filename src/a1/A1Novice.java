package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customeramount = scan.nextInt();//amount of customers
		for (int i = 0;i<customeramount; i++) { //how much to scan
		double customertotal = 0;
		String firstname = null;
		String lastname = null;
		char firstinitial;
		firstname = scan.next(); //string input, first name
		firstinitial = firstname.charAt(0); //assigns first character to first initial
		lastname = scan.next(); //string input, last name
		int grocerycount = scan.nextInt(); // number of groceries
		for (int n=0; n<grocerycount; n++ ) {
			
		String itemname;
		double itemamount = scan.nextDouble(); //scan amount of items
		itemname = scan.next();//scan name of items
		double itemcost = scan.nextDouble();//scan cost of items
		double grocerysum = 0;
		grocerysum = itemcost * itemamount;//math
		customertotal = grocerysum + customertotal;//more math
		}
		
		
		
		
		
		System.out.println(firstinitial + "." + " " + lastname + ": " + String.format("%.2f", customertotal));
		
	}
		scan.close();
}	
}

