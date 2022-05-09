package main;

public class Vegetable {
	public String name;
    public int kcal; // per 100g
	private boolean edible;

    
    public Vegetable(String _name, int _kcal){
    	name = _name;
    	kcal = _kcal;
    	this.edible = false;
        }
    
    public boolean isEdible() {
    	return edible;
    }

}
