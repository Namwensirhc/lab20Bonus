package lab20;

import java.util.ArrayList;
import java.util.Arrays;

public class lab20 {
	//
//	for (int i = 0; i < prices1.length; i++) {
//		System.out.println("Item:  " + items1[i] + " Price : " + prices1[i]);
//	}
//	ArrayList<String> items = new ArrayList<>();
//	items.addAll(items);
//	ArrayList<Double> prices = new ArrayList<>();
//	prices.addAll(prices);
	public static void main(String[] args) {

		String[] items = { "Bananas", "Almond Milk", "Frozen Blueberries", "Frozen Strawberries", " Peanut Butter",
				"Cereal", "Pasta", "Nuts" };
		Double[] prices = { 0.49, 3.19, 4.50, 4.25, 1.75, 3.79, 0.99, 5.60 };

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(items));
		ArrayList<Double> listPrice = new ArrayList<Double>(Arrays.asList(prices));
		// converts my String[] and Double[] to ArrayLists

		System.out.println("Hello user, here is my grocery list. " + "I will do some math shit below it  ");
		System.out.println("=======================================");
		for (double i = 0; i < listPrice.size(); i++) {
			// for loop Allows me to list both Arrays together
			System.out.println("Item:  " + items[(int) i] + "           Price:" + prices[(int) i]);
		}
		System.out.println("=======================================");
		avgPrice(list, listPrice);
	}

	public static double avgPrice(ArrayList<String> list, ArrayList<Double> listPrice) {

		double sum = 0;
		for (int i = 0; i < listPrice.size(); i++) {
			sum += i;
		}

		double avgPrice = sum / listPrice.size();// Avg Double listPrice
		System.out.println("Average: " + avgPrice);
		System.out.println("=========");
		minPrice(list, listPrice);
		return avgPrice;
	}

	public static ArrayList<Double> minPrice(ArrayList<String> list, ArrayList<Double> listPrice) {
		System.out.println("Min Price:");
		System.out.println("========");

		maxPrice(list, listPrice);
		return listPrice;
	}

	public static ArrayList<Double> maxPrice(ArrayList<String> list, ArrayList<Double> listPrice) {
		System.out.println("Max Price:");
		System.out.println("=========");

		return listPrice;
	}

}
