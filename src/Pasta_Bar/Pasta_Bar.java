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
}
