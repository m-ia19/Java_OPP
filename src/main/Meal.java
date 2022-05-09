package main;

public class Meal {

	private float kcalSum;
	private String[] ingredients = new String[100];
	private int[] amounts = new int[100];
	private static int count=0;

    // TODO 5.1 j) ingredients, amounts
    // - Think about how to keep track of how many ingredients were added!
	

    public Meal() {
	 kcalSum= 0;
    }

    public void addFruit(Fruit fruit, int weight) {
	//TODO 5.1 a) Remove this comment after creating the attribute kcalSum.
	 kcalSum += fruit.computeCalories(weight);
	 amounts[count]= weight;
	 ingredients[count] = fruit.name;
	 
	 
	 count++;
	// TODO 5.1j) Add information to ingredients and amounts.
    }

    // TODO 5.1 c) Remove this comment after implementing the Vegetable class.
    public void addVegetable(Vegetable vegetable, int weight) {
	kcalSum += vegetable.computeCalories(weight);
	amounts[count]= weight;
	ingredients[count] = vegetable.name;
	
	count++;
	// TODO 5.1j) Add information to ingredients and amounts.
    }
   

    public void printStatus() {
	// TODO 5.1 a) Remove this comment after creating the attribute kcalSum.
	  System.out.println("Your meal has: " + kcalSum + "kcal.");
	
	// TODO 5.1 j) Print a list of ingredients.
	 for (int i=0; i<count; i++) {
		System.out.println(amounts[i] + "g of " + ingredients[i]);
		 
	 }
    }

}
