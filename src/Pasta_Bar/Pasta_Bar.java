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
}
