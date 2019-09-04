package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	String customerItemType = null;
	double itemCost = 0;
	String firstName = null;
	String lastName = null;
	int groceryAmount = 0;
	int itemAmount = 0;
	int customerAmount = 0;
	int customerItemAmount = 0;
	String itemName = null;
	double customerTotal = 0;
	double itemTotal = 0;
	
	
	String[] itemNameArray = new String[itemAmount]; //Item name and amount arrays
	double[] itemCostArray = new double[itemAmount];

		itemAmount = scan.nextInt();
	
		int i = 0;
		while (i < itemAmount) {  //amount of items
			itemName = scan.next(); //scan name of item
			itemCost = scan.nextDouble(); //scan price of item
	
			itemNameArray[i] = itemName;
			itemCostArray[i] = itemCost;
		
			i++;
		
		}
		String[] customerNameArray = new String[customerAmount]; //Customer name and amount array
		int[] groceryAmountArray = new int[customerAmount];
		double[] customerTotalArray = new double[customerAmount];
		
		customerAmount = scan.nextInt(); //amount of customers
		int n = 0;
		while (n<customerAmount); {
		firstName = scan.next();
		lastName = scan.next();
		groceryAmount = scan.nextInt();//amount of grocery the customer has
		
		customerNameArray[n] = firstName + " " + lastName;//add names and amount of groceries to array
		
		n++;
		
		
		
		for (int v=0; v<groceryAmount; v++); {
		customerItemAmount = scan.nextInt(); //how many of one item a customer has
		customerItemType = scan.next(); //the name of the customer's item
		
		int arrayIndex = Arrays.asList(itemNameArray).indexOf(customerItemType); //call item name from array
		itemCost = itemCostArray[arrayIndex];//call the cost of an item from array
		
		itemTotal = itemCost*customerItemAmount; //how much customer spends on one item
		customerTotal = itemTotal + customerTotal; //customer total is all the item totals added up
		
	
		}
		}

		scan.close();
		
		double max = customerTotalArray[0];
		double min = customerTotalArray[0];
		int maxIndex = 0;
		int minIndex = 0;
		double average = 0;
				
		for (int k=0; k<customerTotalArray.length; k++) {
			
			if (customerTotalArray[k]>max) {
				max = customerTotalArray[k];
				maxIndex = k;
			}
			
		}
		for (int b=0; b<customerTotalArray.length; b++) {
			
			if(customerTotalArray[b]<min) {
				min = customerTotalArray[b];
				minIndex = b;
				
			}
		}
		double totalCost = 0;
		for (int f=0; f<customerAmount; f++) {
			totalCost = customerTotalArray[f] + totalCost;
		}
			double customerAverage = totalCost/customerAmount;
		
					
		
		
		String maxCustomer = customerNameArray[maxIndex];
		String minCustomer = customerNameArray[minIndex];
		
		System.out.println("biggest" +": " + maxCustomer + max);
		System.out.println("smallest" + ": " + minCustomer + min);
		System.out.println("average" + ": " + customerAverage);
		
		
		
		
	}
}
		
	

