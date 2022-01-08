package Pasta_Bar;

import java.util.Scanner;

public class Pasta_Bar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String ingredient = "";
		int price = 0;
		double totalPrice = 0;
		String phone = "";

		String[] ingredients = { "Macaroni", "Spaghetti", "Bolognese", "Turkey", "Beef", "Bacon", "Chicken",
				"4 Cheeses", "Smoked Cheese", "Parmesan", "Sour Creme", "Pesto Sauce", "Napolitana", "Vegetable Mix",
				"Mushroom", "Box" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		String[] Regulars = { "0631111111", "0632222222", "0633333333", "0644444444", "0655555555", "0666666666" };

		menu();

		while (!OrderCompleted(ingredient)) {

			System.out.print("Add your next ingredient: ");
			ingredient = s.nextLine();
			if (!OrderCompleted(ingredient)) {

				int index = findIndex(ingredients, ingredient);

				if (nonexistentIngredient(ingredients, ingredient)) {
					System.out.println("Please use just ingredients from the menu.");
				} else {
					totalPrice = totalPrice + prices[index];
				}
			}
		}

		System.out.print("Enter your phone number please: ");
		phone = s.next();
		System.out.println("");
		if (isRegular(Regulars, phone)) {
			totalPrice = discount(totalPrice);
			System.out.println("Thank you for ordering, your bill is: " + totalPrice);
			;

		} else {

			System.out.println("Thank you for ordering, your bill is: " + totalPrice);
			System.out.println("");
			System.out.println("If you become a regular, you can be eligable for 10% discount on all of your orders.");

		}

	}

	public static int findIndex(String[] ingredients, String ingredient) {
		int i = 0;
		int x = -1;

		while (i < ingredients.length) {

			if (ingredient.equals(ingredients[i])) {
				x = i;
				return x;
			} else if (ingredient.equals("Order")) {
				return 0;
			}
			i++;
		}
		return x;
	}

	public static boolean nonexistentIngredient(String[] ingredients, String ingredient) {
		return (findIndex(ingredients, ingredient) == -1);
	}

	public static double discount(double totalPrice) {
		double toPay = ((totalPrice / 100) * 90);
		return toPay;
	}

	public static boolean OrderCompleted(String ingredient) {
		return (ingredient.equals("Order"));
	}

	public static boolean isRegular(String[] regulars, String phone) {
		boolean isRegular = true;
		for (int i = 0; i < regulars.length; i++) {
			if (phone.equals(regulars[i])) {
				return isRegular;
			}
		}
		isRegular = false;
		return isRegular;
	}
	public static void menu() {

		System.out.println("Welcome to pasta bar, please take a look at our menu and choose your ingredients.");
		System.out.println("");

		System.out.println("MENU");
		System.out.println("INGREDIENT                              PRICE");
		System.out.println("Macaroni________________________________50");
		System.out.println("Spaghetti_______________________________60");
		System.out.println("Bolognese_______________________________120");
		System.out.println("Turkey__________________________________120");
		System.out.println("Beef____________________________________140");
		System.out.println("Bacon___________________________________100");
		System.out.println("Chicken_________________________________100");
		System.out.println("4 Cheeses_______________________________100");
		System.out.println("Smocked Cheese__________________________80");
		System.out.println("Parmesan________________________________50");
		System.out.println("Sour Creme______________________________80");
		System.out.println("Pesto Sauce_____________________________80");
		System.out.println("Napolitana______________________________80");
		System.out.println("Vegetable Mix___________________________50");
		System.out.println("Mushroom________________________________50");
		System.out.println("Box_____________________________________20");
		System.out.println("");
		System.out.println("Type 'Order' when you are ready to finish your purchase.");
		System.out.println("");

	}
}

