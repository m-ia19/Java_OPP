package main;

public class Vegetable {
	public String name;
    public int kcal; // per 100g
	private boolean edible;
	private int cookingMinutes;
	private int cooked;

    
    public Vegetable(String _name, int _kcal, int _cookingMinutes){
    	name = _name;
    	kcal = _kcal;
    	this.edible = false;
    	cookingMinutes = _cookingMinutes;
        }
    
    public boolean isEdible() {
    	return this.edible;
    }
    
    public void cookIt() {
    	this.cooked++;
    	edible= (this.cooked==cookingMinutes)? true: this.edible;
    }
    
    public float computeCalories(float gramms) {
    	// TODO 5.1 b) Fruits with peal contribute only 90% of their mass to the kcal.
    	return (kcal / 100.0f) * (float)(edible ? 1 : 0) * gramms;
        }


}
