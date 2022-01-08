package Pasta_Bar;

public class Pasta_Bar {

	public static void main(String[] args) {

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

